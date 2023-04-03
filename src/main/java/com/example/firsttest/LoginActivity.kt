package com.example.firsttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.view1_btn_procceed)
            .setOnClickListener {
                Log.d("BUTTONS", "You tapped the button!")
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
    }
}