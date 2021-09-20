package com.example.iwallet.iwalletAPI.repository

import com.example.iwallet.iwalletAPI.model.Extract
import org.springframework.data.jpa.repository.JpaRepository

interface ExtractRepository : JpaRepository<Extract, Int> {
}
