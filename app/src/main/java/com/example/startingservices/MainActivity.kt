package com.example.startingservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

var num = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.numbersEditText)

        findViewById<View>(R.id.countdownButton).setOnClickListener{
            num = editText.text.toString().toInt()
            startService(Intent(this,TimerService::class.java))
        }
    }


}