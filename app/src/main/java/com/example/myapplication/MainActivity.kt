package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var rvMark:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvMark = findViewById(R.id.rv_bit)

        rvMark.layoutManager = LinearLayoutManager(this)

        val repository = MarketRepository(BittrexApi())

        GlobalScope.launch(Dispatchers.Main){
            val market = repository.getMarket()
            val adapter = MarketAdapter(market.result)
            rvMark.adapter = adapter
        }
    }
}
