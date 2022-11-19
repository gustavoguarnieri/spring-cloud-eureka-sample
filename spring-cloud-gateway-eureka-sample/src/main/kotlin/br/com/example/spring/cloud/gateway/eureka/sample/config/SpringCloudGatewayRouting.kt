package br.com.example.spring.cloud.gateway.eureka.sample.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.PredicateSpec
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCloudGatewayRouting {

    @Bean
    fun configureRoute(builder: RouteLocatorBuilder): RouteLocator? {
        return builder.routes()
            .route("orderId") { r: PredicateSpec -> r.path("/api/v1/orders").uri("lb://order-service") }
            .build()
    }
}
