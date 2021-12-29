package com.company.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {
    // 抽取相同切入点
    @Pointcut("execution(* com.company.spring5.aopanno.User.add(..))")
    public void pointDemo() {

    }

    @Before("pointDemo()")
    public void before() {
        System.out.println("before.. person");
    }

}
