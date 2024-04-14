package com.example.floorplans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.floorplans.databinding.ActivityViewScheduleBinding

class ViewScheduleActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewScheduleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewScheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val vaule = intent.getStringExtra("type")!!
        binding.btnback.setOnClickListener {
            finish()
        }
        when (vaule) {
            "cr59" -> {
                binding.myZoomageView.setImageResource(R.drawable.cr50)
                binding.title.setText("Cr5.09")
            }

            "cr510" -> {
                binding.title.setText("Cr5.10")
                binding.myZoomageView.setImageResource(R.drawable.cr51)
            }

            "cr511" -> {
                binding.title.setText("Cr5.11")
                binding.myZoomageView.setImageResource(R.drawable.cr511)
            }

            "cr512" -> {
                binding.title.setText("Cr5.12")
                binding.myZoomageView.setImageResource(R.drawable.cr512)
            }

            "cr522" -> {
                binding.title.setText("Cr5.22")
                binding.myZoomageView.setImageResource(R.drawable.cr522)
            }

            "cr523" -> {
                binding.title.setText("Cr5.23")
                binding.myZoomageView.setImageResource(R.drawable.cr523)
            }

            "cr524" -> {
                binding.title.setText("Cr5.24")
                binding.myZoomageView.setImageResource(R.drawable.cr524)
            }

            "lr52" -> {
                binding.title.setText("Lr5.2")
                binding.myZoomageView.setImageResource(R.drawable.lr52)
            }

            "labcbe" -> {
                binding.title.setText("Lab Cbe")
                binding.myZoomageView.setImageResource(R.drawable.labcbe)
            }
        }
    }
}