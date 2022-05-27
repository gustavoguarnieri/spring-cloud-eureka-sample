package br.com.example.spring.cloud.eureka.order.sample.client

import br.com.example.spring.cloud.eureka.order.sample.constant.PRODUCT_SERVICE_NAME
import br.com.example.spring.cloud.eureka.order.sample.model.ProductResponseDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = PRODUCT_SERVICE_NAME)
interface ProductFeignClient {

    @GetMapping("$BASE_PRODUCT_PATH/{productId}")
    fun getProductById(@PathVariable productId: Long): ProductResponseDTO?

    companion object {
        const val BASE_PRODUCT_PATH = "/product-service/api/v1/products"
    }
}
