package com.liuhui.boot.controllelr;


import com.liuhui.boot.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@SuppressWarnings("all")
public class IndexController {


    @GetMapping("/")
    public String loginPage() {
        return "login";
    }


    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if ("张三".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            // 登录成功 重定向到main.html
            return "redirect:/main.html";
        }
        model.addAttribute("msg", "账号密码错误");
        //回到登录页面
        return "login";


    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {

        return "main";
    }

}
