package com.wangchao.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Wang Chao
 * @create 2023/3/28 18:18
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_baidu",
                r -> r.path("/baidu").uri("https://www.baidu.com/")).build();

        routes.route("path_route_qq",
                r -> r.path("/qq").uri("https://www.qq.com/")).build();

        return routes.build();
    }
}
