package com.company.spring5.aopanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring5.xml");
//        User user = applicationContext.getBean("user", User.class);
//        user.add();

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigAop.class);
        User user= applicationContext.getBean("user",User.class);
        user.add();

    }
}
