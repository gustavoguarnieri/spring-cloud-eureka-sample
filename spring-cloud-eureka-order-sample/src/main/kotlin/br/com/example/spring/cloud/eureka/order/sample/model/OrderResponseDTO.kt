package br.com.example.spring.cloud.eureka.order.sample.model

import java.util.UUID

data class OrderResponseDTO(
    var id: UUID,
    var quantity: Int,
    var product: ProductResponseDTO?
)