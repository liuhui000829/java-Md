package com.liuhui.test;

import com.liuhui.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyBatisTest {
    // 查询所有
    @Test
    public void test1() throws IOException {
        // 获得核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 :命名空间 namespace + id
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        // 打印数据
        userList.forEach(v->{
            System.out.println(v);
        });

        // 释放资源
        sqlSession.close();
    }

    //增加
    @Test
    public void test2() throws IOException{
        User user = new User("11", "22");
        // 获得核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作  参数 :命名空间 namespace + id
        int query = sqlSession.insert("userMapper.add",user);
        System.out.println(query);
//        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }
    //删除
    @Test
    public void test3() throws IOException{

        // 获得核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 :命名空间 namespace + id
        int query = sqlSession.delete("userMapper.del",50);

        System.out.println(query);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }

    //修改
    @Test
    public void test4() throws IOException{

        User user = new User("777", "888");
        user.setUid(19);

        // 获得核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 :命名空间 namespace + id
        int query = sqlSession.update("userMapper.modify", user);

        System.out.println(query);
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }


    //根据id查询信息
    @Test
    public void test5() throws IOException{



        // 获得核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 :命名空间 namespace + id
        User user = sqlSession.selectOne("userMapper.findById", 1);
        System.out.println(user);

        sqlSession.close();
    }
}












