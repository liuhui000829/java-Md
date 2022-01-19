package com.liuhui.mapper;

import com.liuhui.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import java.util.List;


public interface UserMapper {

    @Insert( "insert into tab_user (username,password)values(#{username},#{password})")
    void save(User user);

    @Select("select * from tab_user")
    List<User> findAll();


}
