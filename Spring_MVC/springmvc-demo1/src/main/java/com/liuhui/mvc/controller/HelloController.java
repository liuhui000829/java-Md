package com.liuhui.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SuppressWarnings("all")
public class HelloController {
    // WEB-INF/templates/index.html

    @RequestMapping("/")
    public String index(){
        // 返回试图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
