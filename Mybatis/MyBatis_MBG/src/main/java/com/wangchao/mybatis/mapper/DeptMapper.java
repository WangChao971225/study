package com.wangchao.mybatis.mapper;

import com.wangchao.mybatis.pojo.Dept;
import java.util.List;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Mon Feb 20 09:30:18 CST 2023
     */
    int deleteByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Mon Feb 20 09:30:18 CST 2023
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Mon Feb 20 09:30:18 CST 2023
     */
    Dept selectByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Mon Feb 20 09:30:18 CST 2023
     */
    List<Dept> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Mon Feb 20 09:30:18 CST 2023
     */
    int updateByPrimaryKey(Dept record);
}