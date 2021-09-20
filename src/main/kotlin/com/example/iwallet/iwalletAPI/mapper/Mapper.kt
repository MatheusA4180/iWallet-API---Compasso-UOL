package com.example.iwallet.iwalletAPI.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}
