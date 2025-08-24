package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExpertBooking3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_expert_booking3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnHome=findViewById<Button>(R.id.btnbackHome)
        btnHome.setOnClickListener {
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        var btnBack=findViewById<View>(R.id.backButton1)
        btnBack.setOnClickListener {
            val intent= Intent(this, Expert::class.java)
            startActivity(intent)
        }
    }
}