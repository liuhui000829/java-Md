package com.liuhui.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/scopeController")
@SuppressWarnings("all")
public class ScopeController {

    // 使用servletAPI向request域对象共享数据
    // @RequestMapping("/testRequestByServletAPI")
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest req) {
        req.setAttribute("testRequestScope", "hello,servletAPI");

        return "success";
    }

    // 使用servletAPI向request域对象共享数据
    // @RequestMapping("/testRequestByServletAPI")
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        // 处理模型数据,即向请求域request共享数据
        modelAndView.addObject("testRequestScope", "hello,testMoadelAndView");
        // 设置视图名称
        modelAndView.setViewName("success");
        System.out.println("123");
        return modelAndView;
    }


    // 使用Model向request域对象共享数据
    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "hello,Model");
        // 利用反射获取 他们的类名
        System.out.println(model + "  " + model.getClass().getSimpleName());
        return "success";
    }

    // 使用Map向request域对象共享数据
    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello,map");
        System.out.println(map + "  " + map.getClass().getSimpleName());
        // {testRequestScope=hello,map}
        return "success";
    }

    // 使用ModelMap向request域对象共享数据
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello,ModelMap");
        System.out.println(modelMap + "  " + modelMap.getClass().getSimpleName());  //{testRequestScope=hello,ModelMap}
        return "success";
    }

    //向session域共享数据
    @RequestMapping("/testSession")
    public String testSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    //向Application域共享数据
    @RequestMapping("/testApplication")
    public String testSession(HttpSession session) {
        ServletContext applicationContext = session.getServletContext();
        applicationContext.setAttribute("testApplicationScope", "hello,Applicaiton");
        return "success";
    }




}