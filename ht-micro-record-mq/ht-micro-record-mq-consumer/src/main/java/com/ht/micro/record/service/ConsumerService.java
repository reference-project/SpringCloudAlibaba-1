package com.ht.micro.record.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@RabbitListener(queues = "hello")
public class ConsumerService {

    @RabbitHandler
    public void receive(String messgae){
        System.out.println("收到消息： " + messgae);
    }
}
