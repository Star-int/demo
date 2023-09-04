package com.springmyself.demo.service;


import com.springmyself.demo.domain.Student;

import java.util.List;

public interface IStudentService {
    //查询所有员工信息
    List<Student> queryAll();
}
