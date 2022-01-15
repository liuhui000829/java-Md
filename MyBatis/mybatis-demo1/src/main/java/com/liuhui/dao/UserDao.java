package com.liuhui.dao;

import com.liuhui.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findById(int id);

    List<User> findByCondition(User user);

    List<User> findByIds(List<Integer> list);

    void add2(User user);

    List<User> finAllUserAndRoute();

    void del(int i);
    void modify(User user);
}
