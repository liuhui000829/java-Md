package com.company.bean2.testDemo;

import com.company.bean2.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean2.xml");
        Course course = applicationContext.getBean("myBeanFactory", Course.class);
        Course course2 = applicationContext.getBean("myBeanFactory", Course.class);
        System.out.println(course);
        System.out.println(course2);
    }
}
