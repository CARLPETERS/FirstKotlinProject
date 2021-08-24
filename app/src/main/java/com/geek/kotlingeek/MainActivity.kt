package com.geek.kotlingeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodlist = arrayListOf<String>("Burger Place","Big Square","Galitos","KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedFood:TextView = findViewById(R.id.selectedFoodText)
        //set new text for selcted food
        // selectedFood.text = "Burger King"


        val decideButton : Button = findViewById<Button>(R.id.decideButton)
        decideButton.setOnClickListener {
          // logs to the console
         //   println("You Clicked Me !!")

          //  selected random food fromm the list
            val random = Random()
            val randomFood = random.nextInt(foodlist.count())
            selectedFood.text = foodlist[randomFood]

        }

        val addFoodTxt = findViewById<EditText>(R.id.addFoodTxt)
        val addFoodBtn : Button = findViewById(R.id.addFoodButton)

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodlist.add(newFood)
            addFoodTxt.text.clear()
            println(foodlist)
        }


    }
}