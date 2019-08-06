package com.ht.micro.record.service.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = "com.ht.micro.record")
@EnableDiscoveryClient
@EnableBinding({Sink.class})
@EnableAsync
public class SmsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmsServiceApplication.class, args);
    }
}
