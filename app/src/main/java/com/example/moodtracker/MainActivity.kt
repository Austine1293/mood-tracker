package com.example.moodtracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moodInput = findViewById<EditText>(R.id.moodInput)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        submitButton.setOnClickListener {
            val mood = moodInput.text.toString()
            if (mood.isNotEmpty()) {
                resultText.text = "You are feeling: $mood"
            } else {
                resultText.text = "Please enter your mood!"
            }
        }
    }
}
