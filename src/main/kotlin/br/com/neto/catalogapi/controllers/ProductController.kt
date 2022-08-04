package br.com.neto.catalogapi.controllers

import br.com.neto.catalogapi.dtos.requests.ProductRequestDTO
import br.com.neto.catalogapi.dtos.responses.ProductResponseDTO
import br.com.neto.catalogapi.facades.ProductFacade
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/products")
class ProductController {

    @Autowired
    lateinit var productFacade: ProductFacade

    @GetMapping
    fun getAll(): ResponseEntity<MutableList<ProductResponseDTO>> {
        return ResponseEntity(productFacade.getAll(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): ResponseEntity<ProductResponseDTO> {
        return ResponseEntity(productFacade.getById(id), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody productRequestDTO: ProductRequestDTO): ResponseEntity<ProductResponseDTO> {
        return ResponseEntity(productFacade.save(productRequestDTO), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody productRequestDTO: ProductRequestDTO): ResponseEntity<ProductResponseDTO> {
        return ResponseEntity(productFacade.update(id, productRequestDTO), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: String): ResponseEntity<ProductResponseDTO> {
        productFacade.deleteById(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}