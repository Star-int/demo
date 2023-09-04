package com.springmyself.demo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springmyself.demo.domain.Employee;
import com.springmyself.demo.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests
{

    @Autowired
    private EmployeeMapper employeeMapper;

//    @Test
//    void testSave(){
//        Employee employee =new Employee();
//        employee.setAge(18);
//        employee.setId(3);
//        employee.setName("小王");
//        employee.setSalary(1000);
//        employee.setTel(123456);
//        employeeMapper.insert(employee);
//    }

//    @Test
//    void testDelete(){
//        employeeMapper.deleteById(3);
//
//    }

//    @Test
//    void testUpdata(){
//        Employee employee =employeeMapper.selectById(2);
//        employee.setSalary(3000);
//        employeeMapper.updateById(employee);
//    }

    @Test
    void contextLoads()
    {
          List<Employee> employees=employeeMapper.selectList(null);
        System.out.println(employees);
    }

//    @Test
//    void testGetPage(){
//        //需要配置一个分页拦截器
//        IPage page=new Page(2,1);
//        employeeMapper.selectPage(page,null);
//        System.out.println("当前页码值"+page.getCurrent());
//        System.out.println("每页显示数"+page.getSize());
//        System.out.println("一共多少页"+page.getPages());
//        System.out.println("一共多少条数据"+page.getTotal());
//        System.out.println("数据"+page.getRecords());
//
//    }

}


