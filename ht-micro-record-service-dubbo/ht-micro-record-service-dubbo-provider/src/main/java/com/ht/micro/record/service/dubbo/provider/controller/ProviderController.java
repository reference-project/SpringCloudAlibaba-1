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
@RequestMapping("/provider")
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

}
