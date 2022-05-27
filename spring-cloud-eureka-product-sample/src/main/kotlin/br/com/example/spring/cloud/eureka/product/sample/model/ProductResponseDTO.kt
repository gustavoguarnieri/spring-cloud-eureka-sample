package br.com.example.spring.cloud.eureka.product.sample.model

import java.math.BigDecimal

data class ProductResponseDTO(
    var id: Long,
    var name: String,
    var description: String,
    var amount: BigDecimal
)