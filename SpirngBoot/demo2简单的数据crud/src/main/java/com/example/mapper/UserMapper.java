package com.example.mapper;


import com.example.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into tab_user (username,password) values(#{username},#{password})")
    void create(User user);

    @Select("select * from tab_user")
    List<User> getUserList();

}
