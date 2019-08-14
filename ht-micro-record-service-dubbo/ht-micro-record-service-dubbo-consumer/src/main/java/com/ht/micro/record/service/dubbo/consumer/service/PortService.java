package com.ht.micro.record.service.dubbo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: codewj
 * @Date: 2019/7/15 13:21
 * @Description: feign远程调用接口服务
 */

@FeignClient(value = "ht-micro-record-service-dubbo-provider", fallback = NacosProviderFallback.class)
public interface PortService {
    // FeignClient中每一个@RequestParam 都要设置value
    @GetMapping(value = "/provider/port")
    String showPort();
}
