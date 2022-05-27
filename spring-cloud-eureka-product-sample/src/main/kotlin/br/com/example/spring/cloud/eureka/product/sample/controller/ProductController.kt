package br.com.example.spring.cloud.eureka.product.sample.controller

import br.com.example.spring.cloud.eureka.product.sample.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/products")
class ProductController(private val productService: ProductService) {

    @GetMapping
    fun getProducts() = productService.getProducts()

    @GetMapping("/{productId}")
    fun getProduct(@PathVariable("productId") productId: Long) = productService.getProduct(productId)
}