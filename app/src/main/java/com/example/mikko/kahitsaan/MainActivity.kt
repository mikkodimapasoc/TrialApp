package com.example.mikko.kahitsaan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foods = arrayListOf("Jollibee", "Mcdo", "KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pickBtn.setOnClickListener {
            val random = Random()
            val food = random.nextInt(foods.count())
            resultTxt.text = foods[food]
        }
    }
}
