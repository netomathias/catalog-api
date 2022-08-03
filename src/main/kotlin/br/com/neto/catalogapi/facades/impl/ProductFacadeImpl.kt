package br.com.neto.catalogapi.facades.impl

import br.com.neto.catalogapi.dtos.requests.ProductRequestDTO
import br.com.neto.catalogapi.dtos.responses.ProductResponseDTO
import br.com.neto.catalogapi.entities.ProductEntity
import br.com.neto.catalogapi.facades.ProductFacade
import org.springframework.stereotype.Component
import br.com.neto.catalogapi.facades.ProductFacade as Prod

@Component
class ProductFacadeImpl: ProductFacade {
    
    override fun getAll(): MutableList<ProductResponseDTO> {
        TODO("Not yet implemented")
    }

    override fun getById(id: String): ProductResponseDTO {
        TODO("Not yet implemented")
    }

    override fun save(productRequestDTO: ProductRequestDTO): ProductResponseDTO {
        TODO("Not yet implemented")
    }

    override fun update(id: String, productRequestDTO: ProductRequestDTO): ProductResponseDTO {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: String) {
        TODO("Not yet implemented")
    }
}