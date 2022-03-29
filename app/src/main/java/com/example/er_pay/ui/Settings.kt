package com.example.er_pay.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.er_pay.databinding.ActivitySettingsBinding

class Settings : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btncancel.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.btnchange.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
            Toast.makeText(this,"Successfully Made Changes!!!",Toast.LENGTH_LONG).show()
        }

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}