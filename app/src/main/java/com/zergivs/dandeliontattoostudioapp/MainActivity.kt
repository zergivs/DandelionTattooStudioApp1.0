package com.zergivs.dandeliontattoostudioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.buttonSignUp)
        val button2: Button = findViewById(R.id.buttonSingIn)

        button.setOnClickListener {
            // Create an Intent to specify the destination activity
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}