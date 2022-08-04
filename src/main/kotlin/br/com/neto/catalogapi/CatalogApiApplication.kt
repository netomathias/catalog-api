package br.com.neto.catalogapi

import org.modelmapper.ModelMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CatalogApiApplication {

	@Bean
	fun ModelMapper(): ModelMapper {
		return org.modelmapper.ModelMapper()
	}
}

fun main(args: Array<String>) {
	runApplication<CatalogApiApplication>(*args)
}

