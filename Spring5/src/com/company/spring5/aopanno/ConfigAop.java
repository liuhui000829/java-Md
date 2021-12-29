package com.company.spring5.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 创建配置类 不需要xml配置文件
@Configuration
@ComponentScan(basePackages = {"com.company.spring5.aopanno"})      //替代注解扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)                    // Aspect生成代理对象
public class ConfigAop {
}
