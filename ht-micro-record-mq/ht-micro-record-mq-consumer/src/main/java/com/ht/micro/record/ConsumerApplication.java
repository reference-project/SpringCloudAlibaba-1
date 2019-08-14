package com.ht.micro.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Auther: codewj
 * @Date: 2019/8/14 15:25
 * @Description:
 */
@SpringBootApplication
@EnableBinding({Sink.class})
public class ConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


    @StreamListener("input")
    public void receiveInput(String receiveMsg) {
        System.out.println("input receive " + receiveMsg);
    }


}