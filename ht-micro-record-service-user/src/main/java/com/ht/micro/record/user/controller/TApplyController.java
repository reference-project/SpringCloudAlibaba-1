package com.ht.micro.record.user.controller;

import com.github.pagehelper.PageInfo;
import com.ht.micro.record.commons.domain.TApply;
import com.ht.micro.record.commons.service.TApplyService;
import com.ht.micro.record.commons.web.AbstractBaseController;
import com.ht.micro.record.user.dao.BaseRedisDaoInter;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "apply")
public class TApplyController extends AbstractBaseController {
    @Autowired
    private TApplyService tApplyService;
    @Resource
    private BaseRedisDaoInter redisDaoInter;

    /** http://localhost:9506/apply/asked/任大龙
     * @param name
     * @return
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "被询问人名", required = true, paramType = "path")
    })
    @PostMapping(value = "asked/{name}")
    public List<TApply> getByAskedName(@PathVariable String name){
        redisDaoInter.addList("apply",tApplyService.getByAskedName(name));
        return tApplyService.getByAskedName(name);
    }

    /**
     * 消费者传递对象参数，提供者接收参数的方式必须是 POST
     * 并且对象参数前要加上 @RequestBody 的注解
     * http://localhost:10105/apply/page/1/2
     * @param tApply   json传入
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation(value = "询问记录查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, paramType = "path"),
            @ApiImplicitParam(name = "pageSize", value = "笔数", required = true, paramType = "path")
    })
    @PostMapping(value = "page/{pageNum}/{pageSize}",produces = {"application/json;charset=utf-8"})
    public PageInfo<TApply> page(
            @ApiParam(name = "询问详情信息", required = false) @RequestBody(required = false) TApply tApply,
            @PathVariable int pageNum,
            @PathVariable int pageSize
    ) {
        PageInfo<TApply> page = tApplyService.page(tApply, pageNum, pageSize);
        return page;
    }
}