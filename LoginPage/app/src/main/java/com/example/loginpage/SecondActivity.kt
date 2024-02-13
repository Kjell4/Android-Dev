package com.example.loginpage

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val person = intent.getSerializableExtra("Person") as Person

        with(binding) {
            displayFirstName.text = getString(R.string.firstname,person.firstname)
            displayLastName.text = getString(R.string.lastname,person.lastname)
            displayDateOfBirth.text= getString(R.string.dateOfBirth, person.dateOfBirth)
            displayLogin.text = getString(R.string.login, person.login)
        }
    }
}