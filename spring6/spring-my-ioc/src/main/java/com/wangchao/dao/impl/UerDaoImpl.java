package com.wangchao.dao.impl;

import com.wangchao.anno.Bean;
import com.wangchao.dao.UserDao;

/**
 * @author Wang Chao
 * @create 2023/2/13 19:36
 */
@Bean
public class UerDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao....");
    }
}
