package br.com.example.spring.cloud.eureka.product.sample.service

import br.com.example.spring.cloud.eureka.product.sample.model.ProductResponseDTO
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ProductService {
    fun getProducts() = products

    fun getProduct(productId: Long): ProductResponseDTO? {
        return products.find { it.id == productId }
    }

    companion object {
        val products = listOf(
            ProductResponseDTO(
                id = 1,
                name = "Nike Shoes",
                description = "Special Nike running shoes",
                amount = BigDecimal("300.00")
            ),
            ProductResponseDTO(
                id = 2,
                name = "Oakley Shoes",
                description = "EVA formulation for high impact absorption",
                amount = BigDecimal("250.00")
            )
        )
    }
}
