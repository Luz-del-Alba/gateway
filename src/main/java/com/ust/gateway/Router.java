package com.ust.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Router {
    @Bean
    public RouteLocator locator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("customer", r -> r.path("/customer")
                        .uri("http://localhost"))
                .build();
    }
}
