package com.example.iwallet.iwalletAPI.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Extract(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int? = null,
        val broker: String,
        val name: String,
        val category: String,
        val balance: String,
        val date: String,
        val type: String
)
