package com.wangchao.mybatis.test;

import com.wangchao.mybatis.mapper.CacheMapper;
import com.wangchao.mybatis.mapper.DynamicSqlMapper;
import com.wangchao.mybatis.pojo.Emp;
import com.wangchao.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Wang Chao
 * @create 2023/2/19 20:44
 */
public class CacheMapperTest {

    /**
     * 一级缓存测试
     */
    @Test
    public void testOneCache() {
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpByEid(1);
        System.out.println(emp1);
        //使一级缓存失效的方式二：同一个SqlSession但是查询条件不同
        //使一级缓存失效的方式三：同一个SqlSession两次查询期间执行了任意一次增删改操作
        //mapper1.insertEmp(new Emp(null,"abc",23,"男","123@qq.com"));

        //使一级缓存失效的方式四：同一个SqlSession两次查询期间手动清空了缓存
        sqlSession1.clearCache();
        Emp emp2 = mapper1.getEmpByEid(1);
        System.out.println(emp2);

        //使一级缓存失效的方式一：不同的SqlSession对应不同的一级缓存
        /*SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpByEid(1);
        System.out.println(emp2);*/
    }

    @Test
    public void testTwoCache(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(mapper1.getEmpByEid(1));
            sqlSession1.close();
            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println(mapper2.getEmpByEid(1));
            sqlSession2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
