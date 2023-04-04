package com.wangchao.springcloud.dao;

import com.wangchao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Wang Chao
 * @create 2023/3/21 20:12
 */
@Mapper
// mybatis使用中，推荐使用@Mapper, @Repository可能会报错
//@Repository
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
