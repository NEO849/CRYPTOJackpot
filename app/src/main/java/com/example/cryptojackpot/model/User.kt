package com.example.cryptojackpot.model

data class User(
    val username: String,
    val email: String,
    val password: String,
    val confirmPassword: String? = null
)