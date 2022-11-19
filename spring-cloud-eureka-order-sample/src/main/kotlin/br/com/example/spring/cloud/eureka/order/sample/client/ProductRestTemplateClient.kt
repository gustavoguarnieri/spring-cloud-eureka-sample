package br.com.example.spring.cloud.eureka.order.sample.client

import br.com.example.spring.cloud.eureka.order.sample.constant.PRODUCT_SERVICE_NAME
import br.com.example.spring.cloud.eureka.order.sample.model.ProductResponseDTO
import com.netflix.discovery.EurekaClient
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.net.URI

@Component
class ProductRestTemplateClient(private val eurekaClient: EurekaClient) {

    fun getProductById(productId: Long): ProductResponseDTO? {
        val clientPath = BASE_PRODUCT_PATH.plus("/$productId")
        val url = buildURLClientService(clientPath)
        return RestTemplate().getForEntity(url, ProductResponseDTO::class.java).body
    }

    private fun buildURLClientService(path: String): URI {
        val service = eurekaClient.getApplication(PRODUCT_SERVICE_NAME).instances.first()
        return URI.create(
            "http://${service.hostName}:${service.port}$path"
        )
    }

    companion object {
        const val BASE_PRODUCT_PATH = "/api/v1/products"
    }
}