package com.itheima.factory;

import com.itheima.dao.Impl.UserDaoImpl;
import com.itheima.dao.UserDao;

public class UserDaoFactory {

    public UserDao getUserDao()
    {
        return new UserDaoImpl();
    }
}
