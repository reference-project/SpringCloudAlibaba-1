package com.ht.micro.record;

import com.ht.micro.record.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @Auther: codewj
 * @Date: 2019/8/14 15:25
 * @Description:
 */
@SpringBootApplication
@EnableBinding({Source.class})
// 实现了 CommandLineRunner 接口，只是为了 Spring Boot 启动时执行任务
public class ProviderApplication implements CommandLineRunner {


    @Autowired
    private MessageChannel output;
    @Autowired
    private ProviderService providerService;


    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }


    @Override
    public void run(String... args) throws Exception{
        System.out.println("hello");
        output.send(MessageBuilder.withPayload("Hello RocketMQ").build());
        providerService.send("hello", "world !" , 10);
    }
}
