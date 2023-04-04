package com.wangchao.springcloud.service.impl;

import com.wangchao.springcloud.dao.PaymentDao;
import com.wangchao.springcloud.entities.Payment;
import com.wangchao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Wang Chao
 * @create 2023/3/21 20:24
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
