package com.liuhui.service.impl;

import com.liuhui.domain.User;
import com.liuhui.mapper.UserMapper;
import com.liuhui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

//@Service("userService") 原生方式
//public class UserServiceImpl implements UserService {
//
//    public void save(User user) throws IOException {
//
//
//            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//            mapper.save(user);
//            sqlSession.close();
//
//    }
//
//    public List<User> findAll() {
//
//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            List<User> userList = mapper.findAll();
//            sqlSession.close();
//            return userList;
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//
//
//    }
//}


// spring整合了mybatis
@Service("userService")
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void save(User user) {
        userMapper.save(user);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
