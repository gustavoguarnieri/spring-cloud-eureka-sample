package br.com.example.spring.cloud.gateway.eureka.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class GatewaySampleApplication

fun main(args: Array<String>) {
    runApplication<GatewaySampleApplication>(*args)
}
