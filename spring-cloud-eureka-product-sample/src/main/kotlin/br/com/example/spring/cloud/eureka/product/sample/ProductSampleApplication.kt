package br.com.example.spring.cloud.eureka.product.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SpringCloudEurekaProductSampleApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudEurekaProductSampleApplication>(*args)
}



