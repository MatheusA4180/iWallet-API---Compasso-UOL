package com.example.iwallet.iwalletAPI.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Product(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int? = null,
        val broker: String,
        val name: String,
        val category: String,
        var price: String,
        var quantity: String,
        var total: String,
        var date: String,
        var color: String
)
