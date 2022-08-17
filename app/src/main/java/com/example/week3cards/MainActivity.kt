package com.example.week3cards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card = Card("ACE", "HEARTS")

        val flip = findViewById<Button>(R.id.flip)
        val ace = findViewById<TextView>(R.id.AceHearts)
        ace.text = card.getDetails()

        flip.setOnClickListener{
            card.flip()
            ace.text = card.getDetails()
        }


    }


}