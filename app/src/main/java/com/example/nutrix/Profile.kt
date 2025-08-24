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

class Profile : AppCompatActivity() {

    private lateinit var btnHome: ImageView
    private lateinit var btnProduct: ImageView
    private lateinit var btnExpert: ImageView
    private lateinit var btnProfile: ImageView
    private lateinit var btnEditProfile: View
    private lateinit var btnEditProfile2: View
    lateinit var btnLog: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnHome=findViewById(R.id.homeBtn10)
        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        btnLog=findViewById(R.id.btnLogOut)
        btnLog.setOnClickListener {
            val intent= Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
        btnProduct=findViewById(R.id.productBtn10)
        btnProduct.setOnClickListener {
            val intent= Intent(this, Product::class.java)
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
        btnEditProfile=findViewById(R.id.editProfileBtn)
        btnEditProfile.setOnClickListener {
            val intent= Intent(this, EditProfile::class.java)
            startActivity(intent)
        }
        btnEditProfile2=findViewById(R.id.textView47)
        btnEditProfile.setOnClickListener {
            val intent= Intent(this, EditProfile::class.java)
            startActivity(intent)
        }
    }
}