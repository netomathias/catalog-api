package br.com.neto.catalogapi.repositories

import br.com.neto.catalogapi.entities.ProductEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: MongoRepository<ProductEntity, String> {
}