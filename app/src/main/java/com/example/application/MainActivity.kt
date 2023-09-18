package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


lateinit var btnShow:Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName:EditText=findViewById(R.id.editTextName)
        val etEmailAddress:EditText=findViewById((R.id.editTextTextEmailAddress))
        val etDate:EditText=findViewById(R.id.editTextDate)
        val etGender:EditText=findViewById(R.id.editTextGender)
        val etPincode:EditText=findViewById(R.id.editTextNumberPincode)
        val btnShow:Button=findViewById(R.id.btn_Show)

        btnShow.setOnClickListener{
//                val mes="Please wait"
//                Toast.makeText(this, "Please wait", Toast.LENGTH_SHORT).show()
            intent= Intent(this, displayActivity::class.java)
            startActivity(intent)
            }

    }
}