package com.laundry.laundryapps.auth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.laundry.laundryapps.R
import com.laundry.laundryapps.pageView.MainPage

class Login : AppCompatActivity() {
    private lateinit var registBtn : TextView
    private lateinit var loginBtn : Button
    private lateinit var forgetBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        registBtn = findViewById(R.id.regist_btn)
        registBtn.setOnClickListener {
            startActivity(Intent(this@Login, Register::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        loginBtn = findViewById(R.id.btn_login)
        loginBtn.setOnClickListener {
            startActivity(Intent(this@Login, MainPage::class.java))

        }
        forgetBtn = findViewById(R.id.lupa_sandi)
        forgetBtn.setOnClickListener {
            Toast.makeText(this@Login,  "lupa kata sandi?", Toast.LENGTH_LONG).show()

        }

    }
}