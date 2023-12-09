package com.laundry.laundryapps.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.laundry.laundryapps.R

class Register : AppCompatActivity() {
    private lateinit var backBtn : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        backBtn = findViewById(R.id.regist_back_btn)
        backBtn.setOnClickListener {
            startActivity(Intent(this@Register, Login::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }
}