package com.wangchao.mybatis.test;

import com.wangchao.mybatis.mapper.DeptMapper;
import com.wangchao.mybatis.mapper.EmpMapper;
import com.wangchao.mybatis.pojo.Dept;
import com.wangchao.mybatis.pojo.Emp;
import com.wangchao.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Wang Chao
 * @create 2023/2/19 14:24
 */
public class ResultMapTest {

    /**
     * 解决字段名和属性名不一致的情况：
     * a> 为字段取别名，保持和属性名一致
     *
     * b> 设置全局配置，将_自动映射为驼峰
     *      <!--设置MyBatis的全局配置-->
     *      <settings>
     *      <!--将下滑线自动映射称驼峰-->
     *          <setting name="mapUnderscoreToCamelCase" value="true"/>
     *      </settings>
     *
     * c> 通过resultMap设置自定义的映射关系
     *      <resultMap id="empResultMap" type="Emp">
     *          <id property="eid" column="eid"/>
     *          <result property="empName" column="emp_name"/>
     *          <result property="age" column="age"/>
     *          <result property="sex" column="sex"/>
     *          <result property="email" column="email"/>
     *      </resultMap>
     *
     *
     * 处理多对一的映射关系
     * a> 级联属性赋值
     */

    @Test
    public void testGetDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept);
    }

    @Test
    public void testGetDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(1);
        System.out.println(dept);
    }

    @Test
    public void testGetEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(1);
        System.out.println(emp.getEmpName());
    }

    @Test
    public void testGetEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        System.out.println(allEmp);
    }
}
