package com.liuhui.controller;

import com.liuhui.domain.User;
import com.liuhui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
@RequestMapping("/user")
@SuppressWarnings("all")
public class UserController {

    @Autowired
    private UserService userService;

    // 保存
    @PostMapping(value = "/save", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String save(User user) {

        userService.save(user);
        return "恭喜你保存成功";
    }


    // 查询
    @GetMapping("/userList")
    public ModelAndView findAll() {

        List<User> userList = userService.findAll();
        System.out.println(userList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("UserList");

        return modelAndView;
    }
}
