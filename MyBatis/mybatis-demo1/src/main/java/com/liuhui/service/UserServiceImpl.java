package com.liuhui.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuhui.dao.UserDao;
import com.liuhui.domain.Route;
import com.liuhui.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl {


    public static void main(String[] args) throws Exception {

//        User user1 = new User();
//        user1.setUid(20);
//        user1.setUsername("5");
//        user1.setPassword();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(53);


        // 获得核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        userDao.finAllUserAndRoute().forEach(System.out::println);


//        userDao.findAll().forEach(System.out::println);
//        userDao.findByCondition(user1).forEach(System.out::println);
//        userDao.findByIds(integerList).forEach(System.out::println);


        // 分页查询: 当前页 每页条数
        //
//        PageHelper.startPage(5, 3);
//
//        List<User> userList = userDao.findAll();
//        userList.forEach(System.out::println);

        // 获得与分页相关的参数
//        PageInfo<User> pageInfo = new PageInfo<>(userList);
//        System.out.println("当前页" + pageInfo.getPageNum());
//        System.out.println("每页显示条数" + pageInfo.getPageSize());
//        System.out.println("总条数" + pageInfo.getTotal());
//        System.out.println("总页数" + pageInfo.getPages());
//        System.out.println("上一页" + pageInfo.getPrePage());
//        System.out.println("下一页" + pageInfo.getNextPage());
//        System.out.println("是否是第一页" + pageInfo.isIsFirstPage());
//        System.out.println("是否是最后一夜" + pageInfo.isIsLastPage());


//        User user3=new User();
//        user3.setUsername("0");
//        user3.setPassword("0");
//        user3.setBirthday(new Date());
//        userDao.add2(user3);


//         // 释放资源
        sqlSession.close();


    }
}
