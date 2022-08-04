package br.com.neto.catalogapi.facades.impl

import br.com.neto.catalogapi.dtos.requests.ProductRequestDTO
import br.com.neto.catalogapi.dtos.responses.ProductResponseDTO
import br.com.neto.catalogapi.entities.ProductEntity
import br.com.neto.catalogapi.facades.ProductFacade
import br.com.neto.catalogapi.services.ProductService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ProductFacadeImpl: ProductFacade {

    @Autowired
    lateinit var modelMapper: ModelMapper

    @Autowired
    lateinit var productService: ProductService

    override fun getAll(): MutableList<ProductResponseDTO> {
        val productList = mutableListOf<ProductResponseDTO>()
        productService.getAll().forEach { productEntity -> productList.add(convertProductResponseDTOToProductEntity(productEntity)) }
        return productList
    }

    override fun getById(id: String): ProductResponseDTO {
        return convertProductResponseDTOToProductEntity(productService.getById(id))
    }

    override fun save(productRequestDTO: ProductRequestDTO): ProductResponseDTO {
        return convertProductResponseDTOToProductEntity(productService.save(convertProductRequestDTOToProductEntity(productRequestDTO)))
    }

    override fun update(id: String, productRequestDTO: ProductRequestDTO): ProductResponseDTO {
        return convertProductResponseDTOToProductEntity(productService.update(id, convertProductRequestDTOToProductEntity(productRequestDTO)))

    }

    override fun deleteById(id: String) {
        productService.deleteById(id)
    }

    private fun convertProductResponseDTOToProductEntity(productEntity: ProductEntity): ProductResponseDTO {
        return modelMapper.map(productEntity, ProductResponseDTO::class.java)
    }

    private fun convertProductRequestDTOToProductEntity(productRequestDTO: ProductRequestDTO): ProductEntity {
        return modelMapper.map(productRequestDTO, ProductEntity::class.java)
    }
}