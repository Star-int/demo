package com.springmyself.demo.controller;


import com.springmyself.demo.domain.Employee;
import com.springmyself.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class employeeController {
   @Autowired
   private EmployeeMapper employeeMapper;

   @RequestMapping("/list")
   public List<Employee> list(){

       List<Employee> employees = employeeMapper.selectList(null);

       return employees;

   }


}
