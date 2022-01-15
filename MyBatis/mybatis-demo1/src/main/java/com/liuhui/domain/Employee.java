package com.liuhui.domain;

public class Employee {
    private int id;
    private String name;
    private int age;

    // 当前员工属于哪个部门
    private Department department;
    public Employee(){}

    public Employee(String name, int age, Department department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(int id,String name, int age, Department department) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
