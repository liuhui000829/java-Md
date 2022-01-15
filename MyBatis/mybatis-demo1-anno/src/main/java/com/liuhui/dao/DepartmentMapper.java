package com.liuhui.dao;

import com.liuhui.domain.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DepartmentMapper {


    @Select("select * from Department")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(
                    property = "employeeList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.liuhui.dao.EmployeeMapper.getEmployeeByDep_id")
            )
    })
    List<Department> getDepartmentFindAll();


    @Select("select * from Department where id=#{id}")
    Department getDepartmentById(int id);


}
