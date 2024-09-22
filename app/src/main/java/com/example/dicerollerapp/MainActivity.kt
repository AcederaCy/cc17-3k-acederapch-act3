package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    private lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        diceImage = findViewById(R.id.diceImage)
        rollButton = findViewById(R.id.rollButton)

        // Set a click listener for the button
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // Generate a random number between 1 and 6
        val randomInt = Random.nextInt(6) + 1

        // Determine the corresponding drawable resource ID
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        diceImage.setImageResource(drawableResource)
    }
} 