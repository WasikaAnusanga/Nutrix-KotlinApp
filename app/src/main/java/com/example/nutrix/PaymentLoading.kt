package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PaymentLoading : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment_loading)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var name =findViewById<EditText>(R.id.editTextText5)
        var num=findViewById<EditText>(R.id.editTextText6)
        var expiry=findViewById<EditText>(R.id.editTextText7)
        var cvc=findViewById<EditText>(R.id.editTextText8)

        name.setText(intent.getStringExtra("name"))
        num.setText(intent.getStringExtra("num"))
        expiry.setText(intent.getStringExtra("expiry"))
        cvc.setText(intent.getStringExtra("cvc"))


        lifecycleScope.launch {
            delay(3_000)
            val intent = Intent(this@PaymentLoading, PaymentSuccess::class.java)
            startActivity(intent)
            finish()
        }
    }
}