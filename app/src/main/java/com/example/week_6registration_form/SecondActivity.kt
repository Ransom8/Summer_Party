package com.example.week_6registration_form

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var nameOut: TextView
    lateinit var telOut: TextView
    lateinit var emailOut: TextView
    lateinit var sexOut: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")
        val email = intent.getStringExtra("email")
        val sex = intent.getStringExtra("sex")

        nameOut = findViewById(R.id.editTextTextPersonName3)
        telOut = findViewById(R.id.editTextPhone2)
        emailOut = findViewById(R.id.editTextTextEmailAddress2)
        sexOut = findViewById(R.id.genderView)

        nameOut.text = name
        telOut.text = number
        emailOut.text = email
        sexOut.text = sex
    }
}