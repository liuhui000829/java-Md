package com.liuhui.controller;

import com.liuhui.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@SuppressWarnings("all")
@Controller
@RequestMapping("/paramController")
public class ParamController {

    @RequestMapping("/")
    public String test_param(HttpServletRequest req) {
        // 创建一个session
        HttpSession session= req.getSession();
        return "test_param";
    }

//    // 通过servletApi获取
//    @RequestMapping("/testServletAPI")
//    public String testServletAPI(HttpServletRequest req){
//
//
//        String username= req.getParameter("username");
//        String password= req.getParameter("password");
//        System.out.println(username+"  "+password);
//        return "success";
//    }

//    // 通过控制器方法的形参获取
//    // 要求请求的参数名和方法的形参对应
//    @PostMapping("/testServletAPI")
//    public String testServletAPI(String username,String password){
//
//        System.out.println(username+"  "+password);
//        return "success";
//    }

    //
    // @RequestParam注解处理请求参数和控制器方法的
    @PostMapping ("/testServletAPI")  // required=false (如果为true 没有传递参数 则为400) defaultValue 默认值
    public String testServletAPI(@RequestParam(value = "username", required = false, defaultValue = "hehe") String username,
                                 @RequestParam(value = "password",required = false,defaultValue = "123") String password,
                                 @RequestParam(value = "hobby",required = false) String[] hobby,
                                 @RequestHeader(value = "host", required = true, defaultValue = "localhost") String host,
                                 @CookieValue(value="JSESSIONID",required = true,defaultValue = "xxxxxxxx") String cookie
    ) {

        System.out.println(username + "  " + password + "  " + Arrays.toString(hobby) + "  " + host+"  "+cookie);
        return "success";
    }

//    @PostMapping("/testServletAPI34")
//    public String testBean(User user){
//
//    }

}