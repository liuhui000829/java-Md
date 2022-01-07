package com.liuhui.dao;

import com.liuhui.entity.Employee;

import java.util.Collection;

public interface EmployeeDao {

    void save(Employee employee);

    Collection<Employee> getAll();

    Employee get(Integer id);

    void delete(Integer id);

}
