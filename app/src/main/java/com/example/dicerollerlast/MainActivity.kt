package com.example.dicerollerlast

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn:Button=findViewById(R.id.roll_btn)
        rollBtn.setOnClickListener {
            rollDice()
        }
         diceImage=findViewById(R.id.dice_image)



    }

    private fun rollDice() {
        val r= Random.nextInt(6)+1
       val result= when(r){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_1
        }

        diceImage.setImageResource(result)
    }
}


