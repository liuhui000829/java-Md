package com.jdbc.dao;

import com.jdbc.entity.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void del(int id);

    void modify(User user);

    int selCount();

    User findUserInfo(int id);

    List<User> findUserAll();

    List<User> limitQuery(int a, int b);

    void batchAddUser(List<Object[]> objects);


    void addMoney();

    void subMoney();


}
