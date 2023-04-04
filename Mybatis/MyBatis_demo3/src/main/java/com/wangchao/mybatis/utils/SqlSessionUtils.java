package com.wangchao.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Wang Chao
 * @create 2023/2/18 15:22
 */
public class SqlSessionUtils {

    public static SqlSession getSqlSession() {
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
            sqlSession = build.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sqlSession;
    }
}
