package com.example.icetask1and2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//button to the next activity
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}