package com.liuhui.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextLoaderLinstener implements ServletContextListener {

    /**
     * 服务器启动后自动调用
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("对象被创建了");
        // 一般用来加载资源文件
        // 1. 获取servletContext对象
        ServletContext servletContext = sce.getServletContext();

        // 2. 加载资源文件

    }
    /*
    *
    * 在服务器关闭后,servletContext对象被销毁,当服务器正常关闭后该方法被调用
    *
    * */


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("对象被销毁");
    }
}
