package com.liuhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@Controller
@SuppressWarnings("all")
public class UserController {

    /**
     * 使用restful模拟用户资源的增删改查
     * /users    get    查询所有用户信息
     * /user/1  get     根据用户id查询信息
     * /user    post    添加用户信息
     * /user/1  delete  删除用户信息
     * /user    put     修改用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser() {
        System.out.println("查询所有用户信息");
        return "success";
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById() {
        System.out.println("查询id=1用户信息");
        return "success";
    }

    @PostMapping("/user")
    public String insertUser(String username, String password) {
        System.out.println("添加用户信息  用户名:" + username + "   密码:" + password);
        return "success";
    }

    @DeleteMapping(value = "/user")
    public String deleteUser() {
        System.out.println("删除用户信息");
        return "success";
    }

    @PutMapping("/user/{name}")
    public String updateUser() {
        System.out.println("修改用户信息");
        return "success";
    }


}
