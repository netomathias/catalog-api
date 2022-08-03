package br.com.neto.catalogapi.facades

import br.com.neto.catalogapi.dtos.requests.ProductRequestDTO
import br.com.neto.catalogapi.dtos.responses.ProductResponseDTO
import br.com.neto.catalogapi.entities.ProductEntity

interface ProductFacade {

    fun getAll(): MutableList<ProductResponseDTO>
    fun getById(id: String): ProductResponseDTO
    fun save(productRequestDTO: ProductRequestDTO): ProductResponseDTO
    fun update(id: String, productRequestDTO: ProductRequestDTO): ProductResponseDTO
    fun deleteById(id: String)
}