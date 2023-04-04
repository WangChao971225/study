package com.wangchao.springcloud.service;

import com.wangchao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wang Chao
 * @create 2023/3/21 20:23
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
