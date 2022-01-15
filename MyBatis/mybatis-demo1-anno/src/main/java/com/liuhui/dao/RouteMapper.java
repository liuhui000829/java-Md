package com.liuhui.dao;

import com.liuhui.domain.Route;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RouteMapper {
    // 注意了这个y参数2个意思 如果直接调用下面的方法 那么参数就是方法的参数 ，如果被其他查询引用 那么就是引用的查询的column
    @Select("select * from tab_route r,tab_favorite ur where r.rid=ur.rid and #{y} = ur.uid")
    List<Route> getRouteByUid(int id);


    @Select("select * from tab_route")
    @Results({
            @Result(property = "rid", column = "rid"),
            @Result(
                    property = "userList",
                    column = "rid",
                    javaType = List.class,
                    many = @Many(select = "com.liuhui.dao.UserDao.getUserByRid")
            )
    })
    List<Route> getRouteMapperUser();

}
