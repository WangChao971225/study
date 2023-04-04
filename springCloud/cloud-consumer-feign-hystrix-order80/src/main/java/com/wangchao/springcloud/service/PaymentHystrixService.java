package com.wangchao.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Wang Chao
 * @create 2023/3/26 18:54
 */
@Component
@FeignClient(value = "cloud-provider-hystrix-payment",
        fallback = PaymentFallbackService.class)//指定PaymentFallbackService类，执行解耦，将fallback与业务代码分离
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TIMEOUT(@PathVariable("id") Integer id);
}
