package com.springmyself.demo.service.Impl;


import com.springmyself.demo.domain.Student;
import com.springmyself.demo.mapper.StudentMapper;
import com.springmyself.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
   private StudentMapper studentMapper;


    @Override
    public List<Student> queryAll() {
        List<Student> students = studentMapper.queryAll();
        return  students;
    }
}