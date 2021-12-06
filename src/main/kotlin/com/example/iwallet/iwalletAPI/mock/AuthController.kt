package com.example.iwallet.iwalletAPI.mock

import com.example.iwallet.iwalletAPI.mock.AuthController.Companion.PATH_AUTH
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(MockController.PATH_MOCK+PATH_AUTH)
class AuthController(private val mockService: MockService){

    @GetMapping("/user={user}&password={password}")
    fun auth(@PathVariable user: String, @PathVariable password: String): AuthToken {
        return mockService.auth(user,password)
    }

    companion object {
        const val PATH_AUTH = "/auth"
    }

}