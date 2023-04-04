package com.wangchao.mybatis.mapper;

import com.wangchao.mybatis.pojo.User;

import java.util.List;

/**
 * User映射接口
 *
 * @author Wang Chao
 * @create 2023/2/18 11:07
 */
public interface UserMapper {

    /**
     * Mybatis 面向接口编程的两个一致
     * 1. 映射文件中的namespace要和mapper接口中的全类名保持一致
     * 2. 映射文件中的SQL语句的id要和mapper接口中的方法名保持一致
     *
     * 表--实体类--mapper接口--映射文件
     */

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户密码
     */
    void updatePassword();

    /**
     * 查询单条数据
     * @return
     */
    User getUserById();

    /**
     * 查询所有数据
     */
    List<User> getAllUser();
}
