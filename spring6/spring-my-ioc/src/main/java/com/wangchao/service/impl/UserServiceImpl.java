package com.wangchao.service.impl;

import com.wangchao.anno.Bean;
import com.wangchao.anno.Di;
import com.wangchao.dao.UserDao;
import com.wangchao.service.UserService;

/**
 * @author Wang Chao
 * @create 2023/2/13 19:38
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service....");
        userDao.add();
    }
}
