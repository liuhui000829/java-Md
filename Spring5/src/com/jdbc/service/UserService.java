package com.jdbc.service;

import com.jdbc.dao.UserDao;
import com.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE,timeout = 10)
@SuppressWarnings("all")
public class UserService {
    //注入Dao
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    public void addUser(User user) {
        userDao.add(user);
    }


    public void delUser(int id) {
        userDao.del(id);
    }

    // 修改
    public void modifyUser(User user) {
        userDao.modify(user);
    }

    public int findCount() {
        return userDao.selCount();
    }


    public User findUserInfo(int id) {
        return userDao.findUserInfo(id);
    }

    public List<User> findAll() {
        return userDao.findUserAll();

    }
    public List<User>limitUserQuery(int a,int b){
        return userDao.limitQuery(a,b);
    }
    public void batchAdd(List<Object[]> objects){
         userDao.batchAddUser(objects);
    }
    public void transferAccounts(){
        userDao.addMoney();
//        int a=10/0;
        userDao.subMoney();

    }
}
