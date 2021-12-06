package com.example.iwallet.iwalletAPI.mock

data class Transaction(
    val status: String,
    val time: String,
    val type: String,
    val typeDescription: String,
    val value: Double,
    val date: String
)