package com.example.firsttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RecoveryPhraseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery_phrase)
        supportActionBar?.title = ""
    }

}