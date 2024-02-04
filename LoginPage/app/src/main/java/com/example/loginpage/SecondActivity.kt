package com.example.loginpage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstName = intent.getStringExtra("FIRST_NAME")
        val lastName = intent.getStringExtra("LAST_NAME")
        val age = intent.getStringExtra("AGE")
        val login = intent.getStringExtra("LOGIN")

        binding.displayFirstName.text = "First Name: $firstName"
        binding.displayLastName.text = "Last Name: $lastName"
        binding.displayAge.text = "Age: $age"
        binding.displayLogin.text = "Login: $login"
    }
}