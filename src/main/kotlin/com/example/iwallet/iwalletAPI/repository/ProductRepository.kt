package com.example.iwallet.iwalletAPI.repository

import com.example.iwallet.iwalletAPI.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Int> {
}
