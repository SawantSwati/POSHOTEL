package com.example.hotelpos1.Activities

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.hotelpos1.Database.DatabaseHelper
import com.example.hotelpos1.databinding.ActivityLoginPageBinding


class LoginPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginPageBinding
    private lateinit var dbHelper: DatabaseHelper
    private lateinit var database: SQLiteDatabase


    private lateinit var edtEmailAddress: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var rememberCheckBox:CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginPageBinding.inflate(layoutInflater)

        setContentView(binding.root)

        dbHelper = DatabaseHelper(this)
        database = dbHelper.writableDatabase



        edtEmailAddress = binding.edtEmailAddress
        edtPassword = binding.edtPassword
        btnLogin = binding.btnLogin
        rememberCheckBox = binding.rememberCheckBox


        // Handle login button click
        btnLogin.setOnClickListener {
            val email = edtEmailAddress.text.toString()
            val password = edtPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                if (rememberCheckBox.isChecked) {
                    // User login successful
                    Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()

                    Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}

