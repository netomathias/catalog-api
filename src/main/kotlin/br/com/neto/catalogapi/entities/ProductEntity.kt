package br.com.neto.catalogapi.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Document("products")
data class ProductEntity(

    @Id
    var id: String = "",
    var name: String = "",
    var description: String = "",
    var price: BigDecimal = BigDecimal.ZERO
)
