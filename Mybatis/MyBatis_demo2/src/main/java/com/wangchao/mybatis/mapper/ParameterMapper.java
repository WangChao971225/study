package com.wangchao.mybatis.mapper;

import com.wangchao.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Wang Chao
 * @create 2023/2/18 15:16
 */
public interface ParameterMapper {

    /**
     * 通过用户名获取用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 登录校验
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 登录校验（通过map集合的方式传输参数）
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 登录校验（使用@Param注解）
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    /**
     * 查询所有员工信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(User user);

}
