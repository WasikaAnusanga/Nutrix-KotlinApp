package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Expert : AppCompatActivity() {
    private lateinit var btnHome: ImageView
    private lateinit var btnProduct: ImageView
    private lateinit var btnBookNow: Button
    private lateinit var btnProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_expert)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnCart=findViewById<View>(R.id.cartBtn)
        btnCart.setOnClickListener {
            val intent= Intent(this, Cart::class.java)
            startActivity(intent)
        }
        btnHome=findViewById(R.id.homeBtn11)
        btnHome.setOnClickListener {
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        btnProfile=findViewById(R.id.profileBtn11)
        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)

        }
        btnProduct=findViewById(R.id.productBtn11)
        btnProduct.setOnClickListener {
            val intent= Intent(this, Product::class.java)
            startActivity(intent)
        }
        btnBookNow=findViewById(R.id.buttonBookNow)
        btnBookNow.setOnClickListener {
            val intent= Intent(this, ExpertBooking1::class.java)
            startActivity(intent)
        }



    }
}