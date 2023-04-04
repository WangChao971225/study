package com.wangchao.spring5.demo1.service;

import com.wangchao.spring5.demo1.dao.UserDao;

public class UserService {
    //创建userDao类型属性，生成setter方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("add......");
        userDao.update();
    }
}
