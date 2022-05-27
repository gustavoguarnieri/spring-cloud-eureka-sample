package br.com.example.spring.cloud.eureka.server.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringCloudEurekaServerSampleApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudEurekaServerSampleApplication>(*args)
}
