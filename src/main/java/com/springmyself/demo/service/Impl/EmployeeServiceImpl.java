package com.springmyself.demo.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springmyself.demo.domain.Employee;
import com.springmyself.demo.mapper.EmployeeMapper;
import com.springmyself.demo.service.IEmployeeService;
import org.springframework.stereotype.Service;

@Service
public  class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService{


}