package com.example.iwallet.iwalletAPI.dto

import javax.validation.constraints.NotEmpty

data class NewProductForm(
        @field:NotEmpty
        val broker: String,
        @field:NotEmpty
        val name: String,
        @field:NotEmpty
        val category: String,
        @field:NotEmpty
        val price: String,
        @field:NotEmpty
        val quantity: String,
        @field:NotEmpty
        val total: String,
        @field:NotEmpty
        val date: String,
        @field:NotEmpty
        var color: String
)

