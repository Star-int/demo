package com.springmyself.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dataController {

    @RequestMapping("/data")
    public String list(){

        return "今晚月色不美";
    }

}
