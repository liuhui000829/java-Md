package com.liuhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SuppressWarnings("all")
public class InterceptorController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
//        System.out.println(10/0);
        return "success";
    }
}
