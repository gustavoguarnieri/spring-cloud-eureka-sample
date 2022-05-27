package br.com.example.spring.cloud.eureka.order.sample.model

import java.math.BigDecimal

data class ProductResponseDTO(
    var name: String,
    var description: String,
    var amount: BigDecimal
)