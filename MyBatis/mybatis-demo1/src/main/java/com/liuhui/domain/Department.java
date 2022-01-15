package com.liuhui.domain;

import java.util.List;

public class Department {
    private int id;
    private String dep_name;
    private String dep_location;  // 地址
    private List<Employee> employeeList;

    public Department(){}

    public Department(String dep_name, String dep_location, List<Employee> employeeList) {
        this.dep_name = dep_name;
        this.dep_location = dep_location;
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getDep_location() {
        return dep_location;
    }

    public void setDep_location(String dep_location) {
        this.dep_location = dep_location;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", dep_name='" + dep_name + '\'' +
                ", dep_location='" + dep_location + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
