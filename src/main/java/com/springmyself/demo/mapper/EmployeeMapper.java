package com.springmyself.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springmyself.demo.domain.Employee;
import com.springmyself.demo.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {


}
