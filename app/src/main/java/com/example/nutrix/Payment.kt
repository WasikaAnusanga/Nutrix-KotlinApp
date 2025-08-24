package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Payment : AppCompatActivity() {
    private lateinit var btnHome: ImageView
    private lateinit var btnProduct: ImageView
    private lateinit var btnExpert: ImageView
    private lateinit var btnProfile: ImageView

    private lateinit var btnPay: Button
    private lateinit var btnBack: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBack=findViewById(R.id.backButton1)
        btnBack.setOnClickListener {
            val intent= Intent(this, Cart::class.java)
            startActivity(intent)
        }


        btnHome=findViewById(R.id.homeBtn10)
        btnHome.setOnClickListener {
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        btnProfile=findViewById(R.id.profileBtn10)
        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)

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


        btnPay=findViewById(R.id.payButton)
        btnPay.setOnClickListener {

                var cardName=findViewById<EditText>(R.id.editTextText5)
                var cardNum=findViewById<EditText>(R.id.editTextText6)
                var expiryDate=findViewById<EditText>(R.id.editTextText7)
                var cvc=findViewById<EditText>(R.id.editTextText8)



                if(cardName.text.isEmpty())
                {
                    cardName.error="Name is required"
                }else if(cardNum.text.isEmpty()){
                    cardNum.error="Card Number is required"
                }else if(expiryDate.text.isEmpty()){
                    cardNum.error="Expiry is required"
                }else if(cvc.text.isEmpty()){
                    cardNum.error="CVC is required"
                }else{
                    val intent= Intent(this, PaymentLoading::class.java)
                    intent.putExtra("name",cardName.text.toString());//Passing data to the next layout
                    intent.putExtra("num",cardNum.text.toString());
                    intent.putExtra("expiry",expiryDate.text.toString());
                    intent.putExtra("cvc",cvc.text.toString());
                    startActivity(intent)
                }
        }

    }
}