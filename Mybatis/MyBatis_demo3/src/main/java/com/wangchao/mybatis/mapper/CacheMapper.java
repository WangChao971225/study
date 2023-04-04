package com.wangchao.mybatis.mapper;

import com.wangchao.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wang Chao
 * @create 2023/2/19 20:42
 */
public interface CacheMapper {

    Emp getEmpByEid(@Param("eid") Integer eid);
}
