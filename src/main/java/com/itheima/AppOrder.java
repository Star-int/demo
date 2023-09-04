package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOrder {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao =(OrderDao) ctx.getBean("orderDao");
        orderDao.save();

    }
}
