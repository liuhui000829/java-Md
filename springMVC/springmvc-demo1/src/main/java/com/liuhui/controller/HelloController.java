package com.liuhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// 访问的话是: http://localhost/springmvc/helloController/
// http://localhost/springmvc/helloController/target
// 注意不用写后缀
@Controller
@RequestMapping("/helloController")
@SuppressWarnings("all")
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(
            value = {"/target", "/target2"},
            method = {RequestMethod.GET,RequestMethod.DELETE},   //匹配这两种请求
            params = {"user","password=1234"},   // 这个必须同时满足
            headers = {"host=localhost"}        // 请求头中host的值为localhost:80
    )
    public String toTarget() {
        return "target";
    }

    @GetMapping("/getMapping")
    public String getMapping(){
        return "target";
    }

    /**
     *模糊匹配
     * ? 任意的一个单个字符
     * * 任意的多个字符或者没有
     * ** 表示任意的一层或多层目录
     * @return
     */
    @GetMapping("/**/testAnt")
    public String testAnt(){
        return "index";
    }

    /**
     * SpringMVC支持路径中的占位符(重点)
     * 原始请求方式: /deleteUser?id=1
     * rest请求方式: /deleteUser/1
     * @return
     */
    @GetMapping ("/testRest/{username}/{password}")
    public String testRest(@PathVariable("username") String username,@PathVariable("password") String password){
        System.out.println(username+" "+password);
        return "target";
    }



}
