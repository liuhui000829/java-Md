package com.liuhui.test;

import com.liuhui.dao.DepartmentMapper;

import com.liuhui.domain.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class DepartmentTest {

    private DepartmentMapper departmentMapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
    }


    @Test
    public void getDepartmentById() {

        Department department = departmentMapper.getDepartmentById(1);
        System.out.println(department);
    }
    @Test
    public void getDepartmentFindAll(){
        departmentMapper.getDepartmentFindAll().forEach(System.out::println);
    }


}
