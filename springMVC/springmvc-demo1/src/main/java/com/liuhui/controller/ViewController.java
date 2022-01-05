package com.liuhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ViewController")
@SuppressWarnings("all")
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/helloController/getMapping";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/helloController/getMapping";
    }

}
