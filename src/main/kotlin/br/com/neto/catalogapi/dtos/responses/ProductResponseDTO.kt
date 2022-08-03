package br.com.neto.catalogapi.dtos.responses

import java.math.BigDecimal

data class ProductResponseDTO (

    var id: String = "",
    var name: String = "",
    var description: String = "",
    var price: BigDecimal = BigDecimal.ZERO
)