package com.example.labka1.model

import java.io.Serializable

data class Pizza(
    val title: String,
    val description: String,
    val cost: String,
    val image: Int,
) : Serializable
