package com.itheima;

import com.itheima.service.BookService;
import com.itheima.service.Impl.BookServiceImpl;

public class App {

    public static void main(String[] args) {
        BookService bookService =new BookServiceImpl();
        bookService.save();

    }
}
