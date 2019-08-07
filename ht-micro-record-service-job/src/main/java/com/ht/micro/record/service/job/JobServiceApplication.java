package com.ht.micro.record.service.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.ht.micro.record")
@EnableDiscoveryClient
@MapperScan(basePackages = "com.ht.micro.record.commons.mapper")
public class JobServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(JobServiceApplication.class, args);
    }

}
