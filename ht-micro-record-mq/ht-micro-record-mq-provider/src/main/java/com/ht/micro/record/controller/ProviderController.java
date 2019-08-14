package com.ht.micro.record.controller;

import com.ht.micro.record.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "new")
    public String send(@RequestParam String mid ,@RequestParam Integer priority) {
        providerService.send("hello", "world! "+ mid , priority);
        return "消息创建成功！ " + mid;
    }
}
