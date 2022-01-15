package com.liuhui.dao;

import com.liuhui.domain.Department;
import com.liuhui.domain.Employee;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeMapper {
    // 方式一
//    @Select("select *,e.id eid  from department d  join employee e  on d.id = e.dep_id")
//    @Results({
//            @Result(column = "eid", property = "id"),
//            @Result(column = "dep_id", property = "department.id"),
//            @Result(column = "dep_name", property = "department.dep_name"),
//            @Result(column = "dep_location", property = "department.dep_location"),
//    })


 //方式二
    @Select("select * from employee")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(
                    property = "department",        // 要封装的属性名称
                    column = "dep_id",              // 要根据select表中哪个字段(也就是外键)去查询department表中的字段
                    javaType = Department.class,    //要封装的实体类型
                    // select属性,代表查询哪个接口的方法获得数据
                    one = @One(select = "com.liuhui.dao.DepartmentMapper.getDepartmentById") // 方法的全类名
            )
    })

    List<Employee> findAllJoinDepartment();


    @Select("select * from employee where id= #{id}")
    Employee getEmployeeById(int id);

    @Select("select * from employee where dep_id= #{id}")
    Employee getEmployeeByDep_id(int id);
}

