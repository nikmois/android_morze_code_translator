package com.example.morze_28042022

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<Button>(R.id.buttonNext)
        next.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val finish = findViewById<Button>(R.id.buttonExit)
        finish.setOnClickListener{
            finish();
            System.exit(0);
        }
    }
}