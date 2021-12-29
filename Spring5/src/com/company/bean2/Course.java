package com.company.bean2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("all")
public class Course {
    private String cname;

    public Course() {
        System.out.println("第一步 执行无参构造创建bean实例");
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
        System.out.println("第二步 执行set方法设置值");
    }

    public void initMethod(){
        System.out.println("第三步 调用初始化方法");
    }
    public void destroyMethod(){
        System.out.println("第五步 调用销毁方法");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        context.getBean("course",Course.class);
        System.out.println("第四步 获取到bean实例对象");

        // 手动让bean实例销毁
        context.close();
    }



}
