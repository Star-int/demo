package com.springmyself.demo.controller;

import com.springmyself.demo.domain.Student;
import com.springmyself.demo.properties.DataSourceProperties;
import com.springmyself.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //import
@RequestMapping("/student")
public class studentController {

    @Autowired
//    private DataSourceProperties dataSourceProperties;
    private IStudentService IStudentService;


    @RequestMapping("/list1")
    public String list(){

        return "今晚月色不美";
    }
//    public List<Student> list1(){
//
//        //t通过业务层查询学生信息返回给浏览器用户看
//        List<Student> students = IStudentService.queryAll();
//        return students;
//
//    }
}