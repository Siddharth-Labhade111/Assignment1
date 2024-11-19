package com.example.project.assignment1

import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName = findViewById<EditText>(R.id.et_name)
        val etContact = findViewById<EditText>(R.id.et_contact)
        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val etAddress = findViewById<EditText>(R.id.et_address)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)

    }
}