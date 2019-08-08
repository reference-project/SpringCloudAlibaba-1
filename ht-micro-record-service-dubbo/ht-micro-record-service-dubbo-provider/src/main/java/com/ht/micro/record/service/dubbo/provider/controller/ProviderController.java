package com.ht.micro.record.service.dubbo.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/provider",produces="application/json;charset=utf-8")
@Slf4j
public class ProviderController {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/port")
    @SentinelResource(value = "protected-resource", blockHandler = "handleBlock")
    public Object port() {
        return "port= "+ port + ", name=" + applicationContext.getEnvironment().getProperty("user.name");
    }
    public String  handleBlock(BlockException ex) {
        return "限流了";
    }

    @GetMapping("name")
    @SentinelResource(value = "getName", fallback = "getNameFallback")
    public String userName(String name){
        for (int i = 0; i < 100000000L; i++) {
            throw new RuntimeException();
        }
        return "getName " + name;
    }

    // 该方法降级处理函数，参数要与原函数getName相同，并且返回值类型也要与原函数相同，此外，该方法必须与原函数在同一个类中
    public String getNameFallback(String name){
        return "getNameFallback";
    }
}
