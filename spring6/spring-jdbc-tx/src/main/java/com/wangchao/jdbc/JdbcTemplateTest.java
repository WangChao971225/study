package com.wangchao.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.crypto.spec.PSource;
import java.util.List;

/**
 * @author Wang Chao
 * @create 2023/2/14 19:41
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加 修改 删除操作
    @Test
    public void testUpdate() {
        /*
        //1 添加操作
        //第一步 编写sql语句
        String sql = "INSERT INTO t_emp VALUES(NULL,?,?,?)";
        //第二步 调用jdbcTemplate的方法，传入相关参数
        //Object[] params = {"刘德华", 50, "男"};
        //int rows = jdbcTemplate.update(sql, params);
        int rows = jdbcTemplate.update(sql, "周杰伦", 40, "男");
        System.out.println(rows);
        */

        /*
        //2 修改操作
        String sql = "UPDATE t_emp SET name=? WHERE id=?";
        int rows = jdbcTemplate.update(sql, "周杰伦儿", 3);
        System.out.println(rows);
        */

        //3 删除操作
        String sql = "DELETE FROM t_emp WHERE id=?";
        int rows = jdbcTemplate.update(sql, 3);
        System.out.println(rows);
    }

    //查询：返回对象
    @Test
    public void testSelectObject() {
        //写法一：自己封装RowMapper
//        String sql = "SELECT * FROM t_emp WHERE id=?";
//        Emp empResult = jdbcTemplate.queryForObject(sql,
//                (rs, rowNum) -> {
//                    Emp emp = new Emp();
//                    emp.setId(rs.getInt("id"));
//                    emp.setName(rs.getString("name"));
//                    emp.setAge(rs.getInt("age"));
//                    emp.setSex(rs.getString("sex"));
//                    return emp;
//                }, 1);
//
//        System.out.println(empResult);

        //写法二：使用RowMapper的接口实现类
        String sql = "SELECT * FROM t_emp WHERE id=?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);

    }

    //查询：返回list集合
    @Test
    public void testSelectList() {
        String sql = "SELECT * FROM t_emp WHERE id>?";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class), 0);
        System.out.println(empList);
    }

    //查询：返回单个值
    @Test
    public void testSelectValue() {
        String sql = "SELECT count(*) FROM t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
