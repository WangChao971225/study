package com.wangchao.mybatis.mapper;

import com.wangchao.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wang Chao
 * @create 2023/2/19 14:05
 */
public interface DeptMapper {

    /**
     * 通过分布查询员工以及员工所对应的部门信息
     * 分布查询第二步：通过did查询员工所对应的部门
     */
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    /**
     * 获取部门以及部门中所有员工的信息
     */
    Dept getDeptAndEmp(@Param("did") Integer did);

    /**
     * 通过分布查询 查询部门以及部门中所有的员工信息
     * 分布查询第一步：查询部门信息
     */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
