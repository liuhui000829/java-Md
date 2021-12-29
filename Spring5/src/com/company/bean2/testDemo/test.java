package com.company.bean2.testDemo;

import com.company.bean2.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean2.xml");
        Stu stu = applicationContext.getBean("stu", Stu.class);
        System.out.println( stu.getList());
//        System.out.println("score: "+Arrays.toString(stu.getScore()));
//        System.out.println( stu.getSets());
//        System.out.println( stu.getMap());
//        stu.getListSub().forEach(e->{
//            System.out.println(e.getCname());
//        });


        
    }
}
