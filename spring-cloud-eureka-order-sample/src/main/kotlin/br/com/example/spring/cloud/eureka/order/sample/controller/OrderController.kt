package br.com.example.spring.cloud.eureka.order.sample.controller

import br.com.example.spring.cloud.eureka.order.sample.enum.HttpRestClientType
import br.com.example.spring.cloud.eureka.order.sample.model.OrderResponseDTO
import br.com.example.spring.cloud.eureka.order.sample.service.OrderService
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/orders")
class OrderController(private val orderService: OrderService) {

    private val log = KotlinLogging.logger {}

    @GetMapping
    fun getOrders(@RequestParam(required = false) httpRestClientType: HttpRestClientType?): OrderResponseDTO {
        log.info { "getOrders: starting getting orders, httpRestClientType=$httpRestClientType" }
        return orderService.getOrders(httpRestClientType).also {
            log.info { "getOrders: got orders, httpRestClientType=$httpRestClientType" }
        }
    }
}