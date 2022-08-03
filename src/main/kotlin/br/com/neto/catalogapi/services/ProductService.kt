package br.com.neto.catalogapi.services

import br.com.neto.catalogapi.entities.ProductEntity

interface ProductService {

    fun getAll(): MutableList<ProductEntity>
    fun getById(id: String): ProductEntity
    fun save(productEntity: ProductEntity): ProductEntity
    fun update(id: String, productEntity: ProductEntity): ProductEntity
    fun deleteById(id: String)
}