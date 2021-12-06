package com.example.iwallet.iwalletAPI.mock

import org.springframework.stereotype.Service

@Service
class MockService {
    fun auth(user: String, password: String): AuthToken {
        if(user=="henrique@gmail.com"&&password=="123456"){
            return AuthToken(
                TOKEN
            )
        }else if(user=="samuell@gmail.com"&&password=="123456"){
            return AuthToken(
                TOKEN
            )
        }
        else{
            throw Exception("Erro ao tentar autenticar")
        }
    }

    fun returnAllTransactions(token: String): List<Transaction> {
        if(token==TOKEN){
            return listOf(
                Transaction(
                    status = "complet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "06/12/2021"
                ),
                Transaction(
                    status = "incomplet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "06/12/2021"
                ),
                Transaction(
                    status = "complet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "07/12/2021"
                ),
                Transaction(
                    status = "complet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "07/12/2021"
                ),
                Transaction(
                    status = "complet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "07/12/2021"
                ),
                Transaction(
                    status = "incomplet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "08/12/2021"
                ),
                Transaction(
                    status = "complet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "09/12/2021"
                ),
                Transaction(
                    status = "incomplet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "09/12/2021"
                ),
                Transaction(
                    status = "complet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "09/12/2021"
                ),
                Transaction(
                    status = "complet",
                    time = "00:00",
                    type = "Supermercado",
                    typeDescription = "Compras",
                    value = 100.00,
                    date = "09/12/2021"
                )
            )
        }else{
            throw Exception("Token Invalido")
        }
    }

    companion object{
        const val TOKEN = "abcdef"
    }

}