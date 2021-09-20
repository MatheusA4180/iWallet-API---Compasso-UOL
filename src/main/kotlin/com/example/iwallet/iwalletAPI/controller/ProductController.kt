package com.example.iwallet.iwalletAPI.controller

import com.example.iwallet.iwalletAPI.controller.ProductController.Companion.PATH_PRODUCT
import com.example.iwallet.iwalletAPI.dto.NewProductForm
import com.example.iwallet.iwalletAPI.dto.UpdateProductForm
import com.example.iwallet.iwalletAPI.model.Product
import com.example.iwallet.iwalletAPI.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping(PATH_PRODUCT)
class ProductController(private val productService: ProductService) {

    @GetMapping
    fun returnAllProducts(): List<Product> {
        return productService.returnAllProducts()
    }

    @PostMapping
    @Transactional
    fun registerProduct(
            @RequestBody @Valid form: NewProductForm,
            uriBuilder: UriComponentsBuilder
    ): ResponseEntity<Product> {
        val product = productService.registerProduct(form)
        return ResponseEntity
                .created(uriBuilder.path(PATH_PRODUCT + "/${product.id}").build().toUri())
                .body(product)
    }

    @PutMapping
    @Transactional
    fun updateProduct(
            @RequestBody @Valid form: UpdateProductForm
    ): ResponseEntity<Product> {
        val product = productService.updateProduct(form)
        return ResponseEntity.ok(product)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    fun deleteById(@PathVariable id: Long) {
        productService.deleteById(id)
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    fun deleteAllProducts() {
        productService.deleteAllProducts()
    }

    companion object {
        const val PATH_PRODUCT = "/product"
    }

}
