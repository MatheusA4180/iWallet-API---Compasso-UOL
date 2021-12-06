package com.example.iwallet.iwalletAPI.mock

import com.example.iwallet.iwalletAPI.mock.MockController.Companion.PATH_MOCK
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(PATH_MOCK)
class MockController(private val mockService: MockService) {

    @GetMapping("/{token}")
    fun returnAllTransactions(@PathVariable token: String): List<Transaction> {
        return mockService.returnAllTransactions(token)
    }

    companion object {
        const val PATH_MOCK = "/mock"
    }

}

