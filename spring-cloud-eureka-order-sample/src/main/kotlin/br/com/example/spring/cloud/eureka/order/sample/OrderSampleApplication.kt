package br.com.example.spring.cloud.eureka.order.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class SpringCloudEurekaOrderSampleApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudEurekaOrderSampleApplication>(*args)
}
