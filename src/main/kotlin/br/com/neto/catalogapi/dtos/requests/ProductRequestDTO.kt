package br.com.neto.catalogapi.dtos.requests

import java.math.BigDecimal

data class ProductRequestDTO(

    var name: String = "",
    var description: String = "",
    var price: BigDecimal = BigDecimal.ZERO
)
