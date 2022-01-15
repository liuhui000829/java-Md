package com.liuhui.test;

import com.liuhui.dao.UserDao;
import com.liuhui.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserTest {

    private UserDao userDao;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @Test
    public void save() {
        User user = new User("测试1", "测试2");
        userDao.add2(user);
    }

    @Test
    public void del() {
        userDao.del(53);
    }

    @Test
    public void modify() {
        User user = new User(53, "aa", "bb");
        userDao.modify(user);
    }

    @Test
    public void getUserById() {
        User user = userDao.findById(1);
        System.out.println(user);
    }

    @Test
    public void findAll() {
        userDao.findAll().forEach(System.out::println);

    }

    @Test
    public void findByIds() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(20);
        userDao.findByIds(integerList).forEach(System.out::println);
    }

}
