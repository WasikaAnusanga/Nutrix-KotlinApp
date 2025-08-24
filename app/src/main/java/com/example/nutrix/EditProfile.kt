package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditProfile : AppCompatActivity() {
    private lateinit var btnHome: ImageView
    private lateinit var btnProduct: ImageView
    private lateinit var btnExpert: ImageView
    private lateinit var btnProfile: ImageView
    lateinit var btnSaveChange: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnSaveChange=findViewById(R.id.btnSaveChanges)
        btnSaveChange.setOnClickListener {
            var edtName=findViewById<EditText>(R.id.editTextText3)
            var edtAddress=findViewById<EditText>(R.id.editTextText)
            var edtPhoneNum=findViewById<EditText>(R.id.editTextText2)
            var edtGoal=findViewById<EditText>(R.id.editTextText4)


            if(edtName.text.isEmpty())
            {
                edtName.error="Name is required"
            }else if(edtAddress.text.isEmpty()){
                edtAddress.error="Address is required"
            }
            else if(edtPhoneNum.text.isEmpty()){
                Toast.makeText(this,"Phone number is required", Toast.LENGTH_LONG).show()
            }
            else if(edtGoal.text.isEmpty()){
                Toast.makeText(this,"Goal is required", Toast.LENGTH_LONG).show()
            }else{
                val intent= Intent(this, Profile::class.java)
                startActivity(intent)
            }

        }
        btnHome=findViewById(R.id.homeBtn10)
        btnHome.setOnClickListener {
            val intent= Intent(this, HomeActivity::class.java)
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
        btnProfile=findViewById(R.id.profileBtn10)
        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}