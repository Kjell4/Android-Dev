package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            val firstName = binding.firstnameInput.text.toString()
            val lastName = binding.lastnameInput.text.toString()
            val dateOfBirth = binding.birthdateInput.text.toString()
            val login = binding.loginInput.text.toString()
            val password = binding.passwordInput.text.toString()

            val person = Person(
                firstname = firstName,
                lastname = lastName,
                dateOfBirth = dateOfBirth,
                login = login,
                password = password
            )

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Person", person)
            startActivity(intent)
        }
    }
}

