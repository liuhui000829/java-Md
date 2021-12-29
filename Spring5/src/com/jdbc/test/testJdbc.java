package com.jdbc.test;


import com.jdbc.config.ConfigJdbc;
import com.jdbc.entity.User;
import com.jdbc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;


public class testJdbc {
    public static void main(String[] args) {


      ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigJdbc.class);
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean3.xml");
       UserService userService = applicationContext.getBean("userService", UserService.class);

        // 添加
//        User user = new User();
//        user.setUserName("liuhui0829");
//        user.setPassword("123");
//        userService.addUser(user);
//        userService.addUser(user);
//        userService.addUser(user);
//        userService.addUser(user);
//        userService.addUser(user);

        // 删除
//         userService.delUser(1);
        // 修改
//        User user = new User();
//        user.setUserName("ls");
//        user.setPassword("888");
//        user.setUid(3);
//        userService.modifyUser(user);
        // 查询表中的多少条记录
//        int count=userService.findCount();
//        System.out.println(count);

        // 根据id查询对应的人
//        User user = userService.findUserInfo(2);
//        user.toString();
//        System.out.println(user);

        // 查询所有的信息
//        userService.findAll().forEach(v->{
//            System.out.println(v);
//        });
        // 分页查询 a,页数 b,条数
//        userService.limitUserQuery(3,3).forEach(v->{
//            System.out.println(v);
//        });
        // 批量添加
//        ArrayList<Object[]> arrayList = new ArrayList<>();
//        Object[] o1 = {"1", "789"};
//        Object[] o2 = {"2", "789"};
//        Object[] o3 = {"3", "789"};
//        arrayList.add(o1);
//        arrayList.add(o2);
//        arrayList.add(o3);
//        userService.batchAdd(arrayList);

        // 转账操作
       userService.transferAccounts();


    }
}
