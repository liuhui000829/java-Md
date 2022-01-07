package com.liuhui.dao;

import com.liuhui.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
@SuppressWarnings("all")
public class EmployeeDaoImpl implements EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001,"admin", "123456"));
        employees.put(1002, new Employee(1002,"zhangsan", "zhangsan"));
        employees.put(1003, new Employee(1003,"lisi", "lisi"));
        employees.put(1004, new Employee(1004,"wangwu", "wangwu"));
        employees.put(1005, new Employee(1005,"abc", "123"));
    }

    public static Integer initId = 1006;

    // 添加和修改
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employees.put(employee.getId(), employee);
    }


    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee get(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }

}

