package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExpertBooking1 : AppCompatActivity() {
    lateinit var btnCart: TextView
    lateinit var btnBack: TextView

    private lateinit var btnHome: ImageView
    private lateinit var btnProduct: ImageView
    private lateinit var btnExpert: ImageView
    private lateinit var btnProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_expert_booking1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnMakeApointment=findViewById<Button>(R.id.appointmentBtn)
        btnMakeApointment.setOnClickListener {
            var drop1=findViewById<Spinner>(R.id.spinner)
            var drop2=findViewById<Spinner>(R.id.spinner2)

            if (drop1.selectedItemPosition == 0) {
                Toast.makeText(this, "Please select a Date", Toast.LENGTH_LONG).show()
            } else if(drop2.selectedItemPosition==0){
                Toast.makeText(this, "Please selecte a Time", Toast.LENGTH_LONG).show()
            }else{
                val intent= Intent(this, ExpertBooking2::class.java)
                startActivity(intent)
            }

        }
        btnBack=findViewById(R.id.backButton1)
        btnBack.setOnClickListener {
            val intent= Intent(this, Expert::class.java)
            startActivity(intent)
        }
        btnCart=findViewById(R.id.textView56)
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

        btnExpert=findViewById(R.id.expertsBtn11)
        btnExpert.setOnClickListener {
            val intent= Intent(this, Expert::class.java)
            startActivity(intent)
        }

    }
}