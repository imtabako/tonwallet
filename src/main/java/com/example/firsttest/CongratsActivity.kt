package com.example.firsttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CongratsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.title = ""

        findViewById<Button>(R.id.congr_btn0)
            .setOnClickListener {
                val intent = Intent(this, RecoveryPhraseActivity::class.java)
                startActivity(intent)
            }
    }
}