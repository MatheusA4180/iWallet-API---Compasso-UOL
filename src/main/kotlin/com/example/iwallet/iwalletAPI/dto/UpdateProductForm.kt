package com.example.iwallet.iwalletAPI.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class UpdateProductForm(
        @field:NotNull
        val id: Int,
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
