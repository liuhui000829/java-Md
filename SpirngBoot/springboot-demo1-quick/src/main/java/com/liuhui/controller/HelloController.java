package com.liuhui.controller;

import com.liuhui.domain.Pet;
import com.liuhui.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Slf4j              // 注入日志类
@RestController
public class HelloController {

    @Resource
    private Pet pet;
    @Resource
    private User user;

    @RequestMapping("/hello2")
    public String hello() {
        return "你好 SpringBoot";
    }


    @RequestMapping(value = "/pet")
    public Pet hello01() {
        log.info("年后二零");
        return pet;
    }

    @RequestMapping(value = "/user")
    public User hello02() {
        return user;
    }
}


