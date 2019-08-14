package com.ht.micro.record.service.dubbo.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class NacosProviderFallback implements PortService {

    @Override
    public String showPort() {
        return "请求失败，请检查";
    }
}