package com.ht.micro.record.user.controller;

import com.ht.micro.record.commons.domain.TbUser;
import com.ht.micro.record.commons.domain.User;
import com.ht.micro.record.commons.dto.AbstractBaseResult;
import com.ht.micro.record.commons.validator.BeanValidator;
import com.ht.micro.record.commons.web.AbstractBaseController;
import com.ht.micro.record.user.service.TbUserService;
import com.ht.micro.record.user.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "user")
public class UserController extends AbstractBaseController<TbUser> {
    @Autowired
    private TbUserService tbUserService;
    @Autowired
    private UserService userService;

    @RequestMapping
    public String index() {
        return "index";
    }

    @RequestMapping("home")
    public String home() {
        return "home";
    }


    @PostMapping("login")
    public String login(User user, HttpSession session) {
        // 随机生成用户id
        user.setUserId(Math.round(Math.floor(Math.random() * 10 * 1000)));
        // 将用户信息保存到id中
        session.setAttribute("USER", user);
        return "home";
    }

    @PostMapping("logout")
    public String logout(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
        return "home";
    }

    @ApiOperation(value = "查询用户", notes = "根据id获取用户名")
    @GetMapping(value = {"{id}"})
    @ResponseBody
    public String getName(@PathVariable long id){
        return tbUserService.getById(id).getUsername();
    }

    @ApiOperation(value = "删除用户", notes = "删除用户")
    @DeleteMapping(value = {"{id}"})
    @ResponseBody
    public void delete(@PathVariable long id){
        tbUserService.deleteUser(id);
    }

    @ApiOperation(value = "更新用户", notes = "更新用户")
    @PostMapping
    @ResponseBody
    public TbUser update(TbUser userInfo){
        return tbUserService.updateUser(userInfo);
    }

    @ApiOperation(value = "用户注册", notes = "参数为实体类，注意用户名和邮箱不要重复")
    @PostMapping(value = "reg")
    @ResponseBody
    public AbstractBaseResult reg(@ApiParam(name = "tbUser", value = "用户模型") TbUser tbUser) {
        // 数据校验
        String message = BeanValidator.validator(tbUser);
        if (StringUtils.isNotBlank(message)) {
            return error(message, null);
        }


        // 验证密码是否为空
        if (StringUtils.isBlank(tbUser.getPassword())) {
            return error("密码不可为空", null);
        }


        // 验证用户名是否重复
        if (!tbUserService.unique("username", tbUser.getUsername())) {
            return error("用户名已存在", null);
        }


        // 验证邮箱是否重复
        if (!tbUserService.unique("email", tbUser.getEmail())) {
            return error("邮箱重复，请重试", null);
        }


        // 注册用户
        try {
            tbUser.setPassword(DigestUtils.md5DigestAsHex(tbUser.getPassword().getBytes()));
            TbUser user = tbUserService.save(tbUser);
            if (user != null) {
                userService.sendEmail(user);
                response.setStatus(HttpStatus.CREATED.value());
                return success(request.getRequestURI(), user);
            }
        } catch (Exception e) {
            // 这里补一句，将 RegService 中的异常抛到 Controller 中，这样可以打印出调试信息
            return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "注册邮件发送失败", e.getMessage());
        }


        // 注册失败
        return error("注册失败，请重试", null);
    }
}