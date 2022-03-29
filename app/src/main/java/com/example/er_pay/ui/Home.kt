package com.example.er_pay.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.er_pay.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.pay.setOnClickListener {
            startActivity(Intent(this, Pay::class.java))
        }

        binding.request.setOnClickListener {
            startActivity(Intent(this, Requests::class.java))
        }

        binding.settings.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }

        binding.about.setOnClickListener {
            startActivity(Intent(this, About::class.java))
        }

        binding.profile.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }

        binding.notification.setOnClickListener {
            startActivity(Intent(this, Notification::class.java))
        }
    }
}