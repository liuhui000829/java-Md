package com.company.spring5;

public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {

        System.out.println("调用了add");
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
