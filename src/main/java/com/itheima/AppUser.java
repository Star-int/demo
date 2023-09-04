package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao)ctx.getBean("userDao");
        userDao.save();


    }
}
