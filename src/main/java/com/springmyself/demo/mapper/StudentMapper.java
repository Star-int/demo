package com.springmyself.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springmyself.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper extends BaseMapper<Student>
{
    List<Student> queryAll();

}
