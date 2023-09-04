package com.itheima.factory;

import com.itheima.dao.Impl.OrderDaoImpl;
import com.itheima.dao.OrderDao;
//利用静态工厂实例化bean
public class OrderDaoFactory {

    public static OrderDao getOrderDao()
    {
        return new OrderDaoImpl();
    }
}
