package com.ht.micro.record.service.dubbo.consumer.controller;

import com.ht.micro.record.service.dubbo.api.PortApi;
import com.ht.micro.record.service.dubbo.consumer.service.PortService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * consumer
 *
 * @author codewj
 * @date 2019-07-15 13:35:14
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private PortService portService;

    private RestTemplate restTemplate = new RestTemplate();

    @Reference(check = false)
    private PortApi portApi;

    @GetMapping("/rest")
    public Object rest() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("ht-micro-record-service-dubbo-provider");
        String url = String.format("http://%s:%s/provider/port", serviceInstance.getHost(), serviceInstance.getPort());
        System.out.println("request url:" + url);
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/rpc")
    public Object rpc() {
        return portApi.showPort();
    }

    @GetMapping("/feign")
    public Object feign(){
        return portService.showPort();
    }


}
