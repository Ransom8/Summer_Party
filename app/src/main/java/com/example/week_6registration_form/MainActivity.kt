package com.example.week_6registration_form

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var nameText: EditText
    lateinit var emailText: EditText
    lateinit var phoneNumber: EditText
    lateinit var spinner: Spinner
    lateinit var name: String
    lateinit var email: String
    lateinit var number: String
    lateinit var sex: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameText = findViewById(R.id.editTextPersonName)
        emailText = findViewById(R.id.editTextEmailAddress)
        phoneNumber = findViewById(R.id.editTextPhone)
        spinner = findViewById(R.id.spinner)

        button.setOnClickListener {
            name = nameText.text.toString()
            email = emailText.text.toString()
            number = phoneNumber.text.toString()
            sex = spinner.selectedItem.toString()
            val intent = Intent(this, SecondActivity::class.java).also {
                it.putExtra("name", name)
                it.putExtra("email", email)
                it.putExtra("number", number)
                it.putExtra("sex", sex)
            }
            startActivity(intent)
        }
    }
}