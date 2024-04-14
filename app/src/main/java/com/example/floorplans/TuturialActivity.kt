package com.example.floorplans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TuturialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuturial)
        findViewById<ImageView>(R.id.btnbacks).setOnClickListener{
            finish()
        }
    }
}