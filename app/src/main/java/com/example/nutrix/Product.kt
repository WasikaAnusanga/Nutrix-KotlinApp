package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Product : AppCompatActivity() {
    private lateinit var btnHome: ImageView

    private lateinit var btnProductOverview: View

    private lateinit var btnExpert: ImageView
    private lateinit var btnProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCart=findViewById<View>(R.id.cartBtn)
        btnCart.setOnClickListener {
            val intent= Intent(this, Cart::class.java)
            startActivity(intent)
        }
        btnHome=findViewById(R.id.homeBtn10)
        btnHome.setOnClickListener {
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        btnExpert=findViewById(R.id.expertsBtn10)
        btnExpert.setOnClickListener {
            val intent= Intent(this, Expert::class.java)
            startActivity(intent)
        }
        btnProfile=findViewById(R.id.profileBtn10)
        btnProfile.setOnClickListener {
            val intent= Intent(this, Profile::class.java)
            startActivity(intent)
        }
        btnProductOverview=findViewById(R.id.productOverviewBtn)
        btnProductOverview.setOnClickListener {
            val intent= Intent(this, ProductOverview::class.java)
            startActivity(intent)
        }


    }
}