package com.liuhui.test;

import com.liuhui.dao.EmployeeMapper;
import com.liuhui.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class EmployeeTest {

    private EmployeeMapper employeeMapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
    }

    @Test
    public void getEmployeeById() {
        Employee employee = employeeMapper.getEmployeeById(1);
        System.out.println(employee);
    }

    @Test
    public void findAllJoinDepartment(){
        employeeMapper.findAllJoinDepartment().forEach(System.out::println);
    }



}
