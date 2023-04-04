package com.wangchao.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wang Chao
 * @create 2023/3/26 12:08
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机 --> 然后去主启动类中添加@RibbonClient注解
    }
}
