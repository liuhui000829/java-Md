package com.company.spring5.aopanno;

// 增强类
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect     // 生成代理对象
@Order(0)
public class UserProxy {

    // 抽取相同切入点
    @Pointcut("execution(* com.company.spring5.aopanno.User.add(..))")
    public void pointDemo(){

    }

    // 环绕通知
    @Around("pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        // 被增强的方法执行
        System.out.println(
                "环绕中"+
                        proceedingJoinPoint.proceed()
        );
        System.out.println("环绕之后");
    }

    // 前置通知
    @Before("pointDemo()")  // .. 参数列表
    public void before() {
        System.out.println("before");
    }

    // 最终通知
    @After("pointDemo()")
    public void after(){
        System.out.println("after");
    }



    // 当有异常就不通知
    @AfterReturning("pointDemo()")
    public void AfterReturning(){
        System.out.println("AfterReturning");
    }


    // 异常通知
    @AfterThrowing("pointDemo()")
    public void AfterThrowing(){
        System.out.println("AfterThrowing");
    }


}
