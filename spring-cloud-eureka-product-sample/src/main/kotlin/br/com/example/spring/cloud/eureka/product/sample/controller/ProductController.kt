package br.com.example.spring.cloud.eureka.product.sample.controller

import br.com.example.spring.cloud.eureka.product.sample.model.ProductResponseDTO
import br.com.example.spring.cloud.eureka.product.sample.service.ProductService
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/products")
class ProductController(private val productService: ProductService) {

    private val log = KotlinLogging.logger {}

    @GetMapping
    fun getProducts(): List<ProductResponseDTO> {
        log.info { "getProducts: starting getting products" }
        return productService.getProducts().also {
            log.info { "getProduct: got products" }
        }
    }

    @GetMapping("/{productId}")
    fun getProduct(@PathVariable("productId") productId: Long): ProductResponseDTO? {
        log.info { "getProduct: starting getting productId=$productId" }
        return productService.getProduct(productId).also {
            log.info { "getProduct: got productId=$productId" }
        }
    }
}