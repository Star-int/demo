package com.springmyself.demo.domain;

import lombok.Data;

@Data//包含了getter，setter....
public class Student {
    private Long id;
    private String name;
    private int age;
    private String degree;
    private String addr;


}