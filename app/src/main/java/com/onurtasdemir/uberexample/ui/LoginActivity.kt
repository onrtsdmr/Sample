package com.onurtasdemir.uberexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.onurtasdemir.uberexample.R
import com.onurtasdemir.uberexample.fragment.LoginFragment

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction()
            .replace(R.id.loginContainer, LoginFragment())
            .commit()
    }
}
