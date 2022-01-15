package com.liuhui.test;

import com.liuhui.dao.DepartmentMapper;
import com.liuhui.dao.RouteMapper;
import com.liuhui.domain.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class RouteTest {


    private RouteMapper routeMapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        routeMapper = sqlSession.getMapper(RouteMapper.class);
    }

    // 查询route表 和 映射的List<User>
    @Test
    public void test1(){
        routeMapper.getRouteMapperUser().forEach(System.out::println);

    }


    // 根据uid 查询 对应的route
    @Test
    public void test2(){
        routeMapper.getRouteByUid(2).forEach(System.out::println);
    }


}
