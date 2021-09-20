package com.example.iwallet.iwalletAPI.dto

import javax.validation.constraints.NotEmpty

data class NewExtractForm(
        @field:NotEmpty
        val broker: String,
        @field:NotEmpty
        val name: String,
        @field:NotEmpty
        val category: String,
        @field:NotEmpty
        val balance: String,
        @field:NotEmpty
        val date: String,
        @field:NotEmpty
        val type: String
)
