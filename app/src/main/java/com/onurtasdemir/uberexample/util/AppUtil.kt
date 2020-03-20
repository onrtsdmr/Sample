package com.onurtasdemir.uberexample.util

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.onurtasdemir.uberexample.R
import com.onurtasdemir.uberexample.enums.RegisterType
import com.onurtasdemir.uberexample.fragment.LoginFragment
import kotlinx.android.synthetic.main.activity_login.view.*

fun <T> Context.extStartActivity(cls: Class<T>, bundle: Bundle) =
    startActivity(Intent(this, cls).putExtras(bundle))

infix fun Fragment.extChangeLoginFragment(fragment: Fragment){
    this.requireActivity()
        .supportFragmentManager
        .beginTransaction()
        .replace(R.id.loginContainer,fragment)
        .commit()
}
infix fun AppCompatActivity.extChangeDashboardFragment(fragment: Fragment){
    this.supportFragmentManager
        .beginTransaction()
        .replace(R.id.mainContainer,fragment)
        .commit()
}

fun Fragment.extRegisterUser(){
    // insert users in database.
    context!! extShowToastMessage RegisterType.SUCCESSFUL.toString()
    this extChangeLoginFragment LoginFragment()
}

infix fun Context.extShowToastMessage(content: String){
    Toast.makeText(this,content,Toast.LENGTH_SHORT).show()
}

