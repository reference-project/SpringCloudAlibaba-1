package com.ht.micro.record.service.email.controller;

import com.ht.micro.record.commons.domain.TbUser;
import com.ht.micro.record.commons.domain.User;
import com.ht.micro.record.commons.web.AbstractBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "user")
public class UserController extends AbstractBaseController<TbUser> {

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

}