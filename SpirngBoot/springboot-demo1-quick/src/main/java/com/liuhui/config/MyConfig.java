package com.liuhui.config;


import com.liuhui.domain.Pet;
import com.liuhui.domain.User;
import org.apache.logging.log4j.EventLogger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/*
 *  1. 配置类里面使用@Bean标注在方法上给容器注册组件,默认是单实例
 *  2. 配置类本身也是组件
 *  3. proxyBeanMethods 代理bean的方法
 *       Full(proxyBeanMethods = true)
 *       Lite(proxyBeanMethods = false)
 *       组件依赖
 *  4. @Import({User.class,EventLogger.class})
 *       给容器中自动创建出这两个类型的组件,默认组件的名字就是全类名
 *
 *  5. @ImportResource("classpath:bean1.xml")导入xml文件 让他生效
 *
 * */


//@Import({User.class, EventLogger.class})
@Configuration(proxyBeanMethods = false)  // 告诉springboot这是一个配置类
//@ConditionalOnMissingBean(name = "tom")  // 容器中有tom的时候创建实例
//@ImportResource("classpath:bean1.xml")


public class MyConfig {

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("二哈");
    }

    @Bean // 给容器中添加组件, 方法名作为组件的id,返回值类型为组件类型，返回值为组件类型的实例
    public User user01() {
        User user = new User("张三", 18);
        user.setPet(tomcatPet());
        return user;
    }


//    @Bean("aa")
    public String test() {
        return "123";
    }


}
