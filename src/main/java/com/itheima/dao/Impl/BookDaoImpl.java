package com.itheima.dao.Impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

   public void save(){
       System.out.println("book Dao save..... ");
   }

   public void init(){
       System.out.println("book Dao start...");
   }

   public void Destory(){
       System.out.println("book Dao end...");
   }
}
