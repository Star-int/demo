package com.itheima.factory;

import com.itheima.dao.Impl.UserDaoImpl;
import com.itheima.dao.UserDao;
import org.apache.catalina.User;
import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<UserDao> {

   //代替原始实例工厂创建对象方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {//单例
        return true;
    }
}
