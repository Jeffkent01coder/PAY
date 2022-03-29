package com.example.er_pay.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.er_pay.databinding.ActivityRequestsBinding

class Requests : AppCompatActivity() {
    private lateinit var binding: ActivityRequestsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRequestsBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.btncancel.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.btnsend.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
            Toast.makeText(this,"Request Sent Successfully!!!",Toast.LENGTH_LONG).show()
        }


    }
}