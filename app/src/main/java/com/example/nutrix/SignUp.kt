package com.example.nutrix

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class SignUp : AppCompatActivity() {
    lateinit var btnSignIn: TextView
    lateinit var btnCreate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnSignIn=findViewById(R.id.btnSignIn)
        btnCreate=findViewById(R.id.btnCreateAc)
        btnSignIn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }


        btnCreate.setOnClickListener {
            var edtName=findViewById<EditText>(R.id.edtName)
            var edtEmail=findViewById<EditText>(R.id.edtEmail)
            var edtPassword=findViewById<EditText>(R.id.edtPassword)
            var edtPassword2=findViewById<EditText>(R.id.edtPassword2)

            var pw1=edtPassword.text.toString()
            var pw2=edtPassword2.text.toString()

            if(edtName.text.isEmpty())
            {
                edtName.error="Name is required"
            }else if(edtEmail.text.isEmpty()){
                edtEmail.error="Email is required"
            }
            else if(pw1!=pw2){
                Toast.makeText(this,"Password mismatch", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }



        }
    }
}