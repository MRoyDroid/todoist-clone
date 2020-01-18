package com.mithuroy.todoistclone.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mithuroy.todoistclone.R
import com.mithuroy.todoistclone.ui.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnNext.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}
