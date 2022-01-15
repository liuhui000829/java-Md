package com.liuhui.service;

import com.liuhui.dao.DepartmentMapper;
import com.liuhui.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DepartmentServiceImpl {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        departmentMapper.findAll().forEach(System.out::println);

    }
}
