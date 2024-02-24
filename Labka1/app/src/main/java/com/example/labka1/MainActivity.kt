package com.example.labka1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.labka1.adapter.PizzaAdapter
import com.example.labka1.databinding.ActivityMainBinding
import com.example.labka1.model.Pizza
import com.example.labka1.model.PizzaDataSource

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var adapter: PizzaAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        PizzaAdapter(
            onPizzaClick = {
                handleMovieClick(it)
            }
        )

        adapter = PizzaAdapter(
            onPizzaClick = {
                handleMovieClick(it)
            }
        )

        binding.recyclerView.adapter = adapter

        adapter?.setData(PizzaDataSource.pizzaList)

        binding.searchBar.addTextChangedListener {
            val searchQuery = it.toString()

            if (searchQuery.isEmpty()) {
                adapter?.setData(PizzaDataSource.pizzaList)
            } else {
                val list = PizzaDataSource.pizzaList.filter {
                    it.title.contains(searchQuery)
                }

                adapter?.setData(ArrayList(list))
            }
        }
    }

    private fun handleMovieClick(pizza: Pizza) {
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra(SecondActivity.KEY_RESULT, pizza)
        startActivity(intent)

    }

}