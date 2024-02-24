package com.example.labka1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labka1.databinding.ActivitySecondBinding
import com.example.labka1.model.Pizza

class SecondActivity : AppCompatActivity() {

    companion object {
        const val KEY_RESULT = "KeyResult"
    }

    private lateinit var binding: ActivitySecondBinding

    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener{
            finish()
        }

        val pizza = intent.getSerializableExtra(KEY_RESULT) as? Pizza
        if (pizza != null) {
            with(binding){
                pizzaTitleSecond.text = pizza.title
                pizzaDescriptionSecond.text = pizza.description
                pizzaCostCart.text = getString(R.string.cart_str, pizza.cost)
                pizzaImageSecond.setImageResource(pizza.image)
            }
        }

    }
}