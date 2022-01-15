package com.liuhui.dao;

import com.liuhui.domain.Department;
import com.liuhui.domain.Route;
import com.liuhui.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    @Select("select *   from tab_user")
    List<User> findAll();

    @Select("select * from tab_user  where uid = #{id}")
    User findById(int id);


    @Select("select * from tab_user where uid in (#{list})  ")
    List<User> findByIds(List<Integer> list);


    @Insert("insert into tab_user(username, password)values (#{username}, #{password})")
    void add2(User user);


    @Insert("delete  from tab_user where uid = #{id}")
    void del(int i);

    @Update("update tab_user  set username=#{username }, password=#{password}  where uid = #{uid}")
    void modify(User user);


    @Select("select * from tab_user where  uid=#{uid}  and username=#{username} and password=#{password}")
    List<User> findByCondition(User user);



    @Select("select * from tab_user ")
    @Results({
            @Result(column = "uid", property = "uid"),
            @Result(
                    property = "routeList",        // 要封装的属性名称
                    column = "uid",                 // 根据哪个字段去route表中查询中去查询
                    javaType = List.class,    //要封装的实体类型
                    // select属性,代表查询哪个接口的方法获得数据
                    many = @Many(select = "com.liuhui.dao.RouteMapper.getRouteByUid") // 方法的全类名
            )
    })
    List<User> finAllUserAndRoute();

    @Select("select * from tab_user u,tab_favorite ur where #{x}=ur.rid and u.uid = ur.uid")
    // 根据User表的 uid 在 中间表中查询 uid 然后让中间表关联 Route表
    List<User> getUserByRid(int rid);

}

