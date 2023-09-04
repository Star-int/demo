package com.itheima.service.Impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.Impl.BookDaoImpl;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
   //删除业务层中使用new方式生成的dao对象
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save.....");
        bookDao.save();
    }
    //提供set方法

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }
}
