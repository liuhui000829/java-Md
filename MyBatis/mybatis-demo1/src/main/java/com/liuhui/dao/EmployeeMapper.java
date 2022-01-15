package com.liuhui.dao;

import com.liuhui.domain.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> findAll();
}
