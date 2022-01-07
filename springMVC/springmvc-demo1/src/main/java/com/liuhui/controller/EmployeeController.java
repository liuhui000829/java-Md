package com.liuhui.controller;


import com.liuhui.dao.EmployeeDao;
import com.liuhui.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

@Controller
@SuppressWarnings("all")
public class EmployeeController {
    @Resource
    private EmployeeDao employeeDaoImpl;

    // 查询所有用户列表
    @GetMapping("/employee")
    public String getAllEmployee(Model model) {
        Collection<Employee> employeeList = employeeDaoImpl.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";

    }

    // 根据id删除用户
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDaoImpl.delete(id);
        return "redirect:/employee";
    }

    // 增加一个员工
    @PostMapping("/employee")
    public String addEmployee(Employee employee) {
        employeeDaoImpl.save(employee);
        System.out.println(employee);
        return "redirect:/employee";
    }

    // 修改员工信息
    @PutMapping ("/employee")
    public String updateEmployee(Employee employee) {
        employeeDaoImpl.save(employee);
        return "redirect:/employee";
    }

    // 根据id查询员工
    @GetMapping(value = "/employee/{id}",produces = "text/html;charset=utf-8")
    public String getEmployeeById(@PathVariable("id") Integer id){
       Employee employee= employeeDaoImpl.get(id);
       System.out.println(employee);
        return "redirect:/employee";
    }





}
