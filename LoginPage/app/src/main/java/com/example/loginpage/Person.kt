package com.example.loginpage

import java.io.Serializable

data class Person(
    val firstname : String,
    val lastname : String,
    val dateOfBirth : String,
    val login : String,
    val password : String
) : Serializable
