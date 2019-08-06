package com.ht.micro.record.user.service;

import com.ht.micro.record.commons.domain.TbUser;
import com.ht.micro.record.commons.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private MessageChannel output;


    // @EnableAsync在Application中开启异步
    @Async
    public void sendEmail(TbUser tbUser) throws Exception {
        output.send(MessageBuilder.withPayload(MapperUtils.obj2json(tbUser)).build());
    }


}