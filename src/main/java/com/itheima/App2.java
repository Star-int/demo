package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
//        BookService bookServic=(BookService)ctx.getBean("bookService");
//        bookServic.save();
        ctx.close();
    }
}
