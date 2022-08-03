package br.com.neto.catalogapi.services.impl

import br.com.neto.catalogapi.entities.ProductEntity
import br.com.neto.catalogapi.repositories.ProductRepository
import br.com.neto.catalogapi.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl: ProductService {

    @Autowired
    private lateinit var productRepository: ProductRepository

    override fun getAll(): MutableList<ProductEntity> {
        return productRepository.findAll()
    }

    override fun getById(id: String): ProductEntity {
        return productRepository.findById(id).orElseThrow()
    }

    override fun save(productEntity: ProductEntity): ProductEntity {
        return productRepository.save(productEntity)
    }

    override fun update(id: String, productEntity: ProductEntity): ProductEntity {
        getById(id)
        productEntity.id = id
        return productRepository.save(productEntity)
    }

    override fun deleteById(id: String) {
        productRepository.deleteById(id)
    }
}