package com.liuhui.javaweb01;


import javax.servlet.*;
import java.io.IOException;



public class HelloServlet2 implements Servlet {

    /**
     * 在servlet被创建时执行,只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("int...");
    }

    /**
     * 获取ServletConfig对象
     * ServletConfig: servlet的配置的方案
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次servlet被访问时,执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service...");
    }

    /**
     * 获取servlet的一些信息,版本,作者等等
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时,执行，只执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}