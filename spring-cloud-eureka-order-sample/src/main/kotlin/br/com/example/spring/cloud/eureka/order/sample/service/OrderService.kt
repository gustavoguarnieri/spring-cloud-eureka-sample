package br.com.example.spring.cloud.eureka.order.sample.service

import br.com.example.spring.cloud.eureka.order.sample.client.ProductFeignClient
import br.com.example.spring.cloud.eureka.order.sample.client.ProductRestTemplateClient
import br.com.example.spring.cloud.eureka.order.sample.enum.HttpRestClientType
import br.com.example.spring.cloud.eureka.order.sample.model.OrderResponseDTO
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class OrderService(
    private val productRestTemplateClient: ProductRestTemplateClient,
    private val productFeignClient: ProductFeignClient
) {
    fun getOrders(httpRestClientType: HttpRestClientType?): OrderResponseDTO {
        return when (httpRestClientType) {
            HttpRestClientType.FEIGN -> {
                OrderResponseDTO(
                    id = UUID.randomUUID(),
                    quantity = (0..50).random(),
                    product = productFeignClient.getProductById(1)
                )
            }
            else -> {
                OrderResponseDTO(
                    id = UUID.randomUUID(),
                    quantity = (0..50).random(),
                    product = productRestTemplateClient.getProductById(1)
                )
            }

        }
    }
}
