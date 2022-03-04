package com.dakam.wallmartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        val intent = intent
        var username = intent.getStringExtra("username")
        var welEditText = findViewById<TextView>(R.id.welcome)
        welEditText.text = "Welcome "+ username
        var electronics = findViewById<ImageView>(R.id.electronics)
        var clothings = findViewById<ImageView>(R.id.clothing)
        var beauty = findViewById<ImageView>(R.id.beauty)
        var food = findViewById<ImageView>(R.id.food)
        electronics.setOnClickListener{
            Toast.makeText(this,"You have chosen the Electronics category of shopping", Toast.LENGTH_LONG).show()
        }
        clothings.setOnClickListener{
            Toast.makeText(this,"You have chosen the Clothing category of shopping", Toast.LENGTH_LONG).show()

        }
        beauty.setOnClickListener{
            Toast.makeText(this,"You have chosen the Beauty category of shopping", Toast.LENGTH_LONG).show()

        }
        food.setOnClickListener{
            Toast.makeText(this,"You have chosen the Food category of shopping", Toast.LENGTH_LONG).show()

        }


    }
}