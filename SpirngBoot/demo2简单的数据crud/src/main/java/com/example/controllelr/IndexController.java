package com.example.controllelr;



import com.example.domain.User;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.extern.slf4j.Slf4j;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
@SuppressWarnings("all")
public class IndexController {

    @Resource
    private UserMapper userMapper;


    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @ResponseBody
    @PostMapping("/login")
    public String main(User user) {
        userMapper.create(user);
        return "添加成功";


    }

    @GetMapping("/list")
    public ModelAndView mainPage() {
        List<User> userList =  userMapper.getUserList();;
        System.out.println(userList);


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("UserList");
        return modelAndView;

    }

}
