package com.company.bean1.service;

import com.company.bean1.dao.UserDao;


public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add........");
        userDao.update();
    }
}
