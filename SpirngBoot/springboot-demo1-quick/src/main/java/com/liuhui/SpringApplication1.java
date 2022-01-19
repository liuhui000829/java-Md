package com.liuhui;

import com.liuhui.config.MyConfig;
import com.liuhui.domain.Pet;
import com.liuhui.domain.User;
import org.apache.logging.log4j.EventLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApplication1 {

    public static void main(String[] args) {

        // 1. 返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(SpringApplication1.class, args);
        // 2. 查看容器里面的组件
//        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }

        // 3. 从容器中获取组件

//        Pet tom = run.getBean("tom", Pet.class);
//        Pet tom2 = run.getBean("tom", Pet.class);
//        System.out.println(tom == tom2);      // true
//
//        // 4. 配置类也是一个组件
//        MyConfig myConfig = run.getBean(MyConfig.class);
//        System.out.println(myConfig);         // com.liuhui.config.MyConfig$$EnhancerBySpringCGLIB$$634f2f75@5a9800f8
//
//        // 5. 如果@Configuration(proxyBeanMethods = true)代理对象调用方法 springboot总会检查这个组件在容器中是否存在
//        // 保持组件单实例
//        // 如果@Configuration(proxyBeanMethods = false)代理对象调用方法 springboot总会检查这个组件在容器中是否存在
//        User user = myConfig.user01();
//        User user1 = myConfig.user01();
//        System.out.println(user == user1);    // true/false
//
//
//        System.out.println(myConfig.user01());
//        System.out.println(myConfig.tomcatPet());
//        System.out.println(myConfig.user01().getPet() == myConfig.tomcatPet());
//
//
//        System.out.println("===============");
//        for (String s : run.getBeanNamesForType(User.class)) {
//            System.out.println(s);
//        }
//        System.out.println(run.getBean(EventLogger.class));

//        com.liuhui.domain.User
//         user01
//        org.apache.logging.log4j.EventLogger@60e9c3a5

        // run.containsBean 检测容器中是否有该组件
//        System.out.println(run.containsBean("aa"));        // false
//        System.out.println(run.containsBean("tom"));        // true
//
//        User haha = (User) run.getBean("haha");
//        System.out.println(haha);


    }

}
