package com.company.bean2;


import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory implements FactoryBean<Course> {
    // 定义返回的bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}
