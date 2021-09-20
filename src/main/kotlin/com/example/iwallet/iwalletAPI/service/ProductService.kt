package com.example.iwallet.iwalletAPI.service

import com.example.iwallet.iwalletAPI.dto.NewProductForm
import com.example.iwallet.iwalletAPI.dto.UpdateProductForm
import com.example.iwallet.iwalletAPI.exception.NotFoundException
import com.example.iwallet.iwalletAPI.mapper.ProductFormMapper
import com.example.iwallet.iwalletAPI.model.Product
import com.example.iwallet.iwalletAPI.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
        private val productRepository: ProductRepository,
        private val productFormMapper: ProductFormMapper
) {

    fun returnAllProducts(): List<Product> = productRepository.findAll()

    fun registerProduct(form: NewProductForm): Product {
        val product = productFormMapper.map(form)
        productRepository.save(product)
        return product
    }

    fun updateProduct(form: UpdateProductForm): Product {
        val product = productRepository.findById(form.id)
                .orElseThrow { NotFoundException(NOT_FOUND_EXCEPTION) }
        product.price = form.price
        product.quantity = form.quantity
        product.total = form.total
        product.date = form.date
        product.color = form.color
        return product
    }

    fun deleteById(id: Long) {
        productRepository.deleteById(id.toInt())
    }

    fun deleteAllProducts() {
        productRepository.deleteAll()
    }

    companion object {
        const val NOT_FOUND_EXCEPTION = "Produto não encontrado"
    }

}
