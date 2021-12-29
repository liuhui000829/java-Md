package com.jdbc.dao;

import com.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    //注入jdbcTemplate
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into tab_user(username,password)values(?,?)";
        Object[] obj = {user.getUserName(), user.getPassword()};
        int update = jdbcTemplate.update(sql, obj);  // 这个参数是个可变参数
        System.out.println(update);

    }

    @Override
    public void del(int id) {
        String sql = "delete from tab_user where uid =?";
        int del = jdbcTemplate.update(sql, id);
        System.out.println(del);
    }

    @Override
    public void modify(User user) {
        String sql = "update tab_user set username=?,password=? where uid=?";
        Object[] obj = {user.getUserName(), user.getPassword(), user.getUid()};
        int update = jdbcTemplate.update(sql, obj);
        System.out.println(update);
    }

    // 查询表中有多少条记录
    @Override
    public int selCount() {
        String sql = "select count(*) from tab_user";
        return jdbcTemplate.queryForObject(sql, Integer.class);  // 第二个参数是返回值类型的class

    }

    // 根据id查询信息
    @Override
    public User findUserInfo(int id) {
        String sql = "select * from tab_user where uid=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    //查询表中所有记录
    @Override
    public List<User> findUserAll() {
        String sql = "select * from tab_user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    // 分页查询
    @Override
    public List<User> limitQuery(int a, int b) {
        String sql = "select * from tab_user limit ?,?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class), a, b);
    }

    //批量添加
    @Override
    public void batchAddUser(List<Object[]> objects) {
        String sql = "insert into tab_user(username,password)values(?,?)";
        int[] num = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(Arrays.toString(num));
    }


    @Override
    public void addMoney() {
        String sql = "update tab_user set money=money-100 where uid=?";
        int add = jdbcTemplate.update(sql, 1);
        System.out.println(add);
    }

    @Override
    public void subMoney() {
        String sql = "update tab_user set money=money+100 where uid=?";
        int sub = jdbcTemplate.update(sql, 2);
        System.out.println(sub);
    }
}
