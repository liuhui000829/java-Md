package com.example.Request;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 演示Request对象获取请求行数据
 */
@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 1. 获取请求方式: GET
         * 					* String getMethod()
         *
         * 				2. 获取虚拟目录: /day14
         * 					* String getContextPath()
         *
         * 				3. 获取Servlet路径: /demo1
         * 					* String getServletPath()
         *
         * 				4. 获取请求参数: name=zhangsan
         * 					* String getQueryString()
         *
         * 				5. 获取请求的uri:
         * 					* String getRequestURI() ==>/day14/demo1
         * 					* StringBuffer getRequestURL() ==>http://localhost/day14/demo1
         *
         * 				6. 获取协议和版本: HTTP/1.1
         * 					* String getProtocal()
         *
         * 				7. 获取客户机的ip地址
         * 					* String getRemoteAddr()
         *
         *
         */
        System.out.println("===========获取请求行数据");
        System.out.println("getMethod" + "  " + request.getMethod());
        System.out.println("getContextPath" + "  " + request.getContextPath());
        System.out.println("getServletPath" + "  " + request.getServletPath());
        System.out.println("getQueryString" + "  " + request.getQueryString());
        System.out.println("getRequestURI" + "  " + request.getRequestURI());
        System.out.println("getRequestURL" + "  " + request.getRequestURL());
        System.out.println("getProtocol" + "  " + request.getProtocol());
        System.out.println("getRemoteAddr" + "  " + request.getRemoteAddr());

        System.out.println("====================================================================");
        System.out.println("获取所有请求头名称");

        // 获取请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            // 根据名称获取请求头的值
            String value = request.getHeader(name);
            System.out.println(name + "-------" + value);
        }

        System.out.println("=========================================================");
        System.out.println("获取特定的请求头");
        System.out.println(request.getHeader("user-agent").contains("Chrome"));
        System.out.println(request.getHeader("accept"));

        String referer = request.getHeader("referer");
        // 直接访问是没有的为null 比如从超链接访问过来的就显示它 http://localhost:8080/javaweb-02/
        System.out.println(referer);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求消息体 --请求参数
        //1. 获取字符流
        BufferedReader br = request.getReader();
        //2. 读取数据
        String line = br.readLine();
        while (line  != null) {
            System.out.println(line);
        }
    }
}
