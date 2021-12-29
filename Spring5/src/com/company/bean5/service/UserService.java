package com.company.bean5.service;

import com.company.bean5.config.SpringConfig;
import com.company.bean5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 在注解里面value属性值可以省略不写
 * 默认是类名称 首字母小写
 *
 * @component(value="userService") 全称是这样的
 */

@Service
@SuppressWarnings("all")
public class UserService {
    @Value("abc")
    private String name;

    // 定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
    //    @Autowired   // 根据类型注入
    //    @Qualifier(value = "userDaoImpl")   // 根据名称注入
    //    private UserDao userDao;

     // @Resource  // 根据类型注入
     @Resource(name = "userDaoImpl")             //根据名称注入
    private UserDao userDao;

    public void add() {
        System.out.println("service add..." + name);
        userDao.add();
    }

//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.add();
//    }
       public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
