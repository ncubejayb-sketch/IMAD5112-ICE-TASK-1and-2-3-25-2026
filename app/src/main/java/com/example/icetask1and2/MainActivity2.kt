package com.example.icetask1and2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val TypeHere = findViewById<EditText>(R.id.TypeHere)
      //  val Answer = findViewById<TextView>(R.id.Answer)

        //Reset Button
        val reset = findViewById<Button>(R.id.rest)
        reset.setOnClickListener { TypeHere.text.clear() }

//when statment
        val HourOfDay = "Morning"
    when(HourOfDay){
        "Morning"-> {
            Toast.makeText(this,"Review your notes from yesterday's lecture for 15 minutes",Toast.LENGTH_LONG).show()
        }
       "Mid Morning"-> {
           Toast.makeText(this,"Tackle your most difficult assignment or task while your focus is high",Toast.LENGTH_LONG).show()
       }
        "Afternoon"-> {
            Toast.makeText(this,"Take a 10-minute break, stretch, and drink some water before continuing",Toast.LENGTH_LONG).show()
        }
        "Afternoon Snack Time"-> {
            Toast.makeText(this,"Do a quick 5-minute revision quiz on today's topic",Toast.LENGTH_LONG).show()
        }
        "Evening"-> {
            Toast.makeText(this,"Organise your notes and create a to-do list for tomorrow",Toast.LENGTH_LONG).show()
        }
        "Nigth"-> {
            Toast.makeText(this,"Wind down by reading over your goals and preparing your bag for tomorrow",Toast.LENGTH_LONG).show()
        }


    }
        }
    }
