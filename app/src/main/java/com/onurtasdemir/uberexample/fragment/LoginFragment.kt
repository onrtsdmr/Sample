package com.onurtasdemir.uberexample.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.onurtasdemir.uberexample.R
import com.onurtasdemir.uberexample.ui.DashboardActivity
import com.onurtasdemir.uberexample.util.extChangeLoginFragment
import com.onurtasdemir.uberexample.util.extStartActivity
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login), View.OnClickListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener(this)
        btn_register.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_login -> if (edtLoginPhoneNumber.text.toString() == "1" && edtLoginPassword.text.toString() == "1")
                context!!.extStartActivity(DashboardActivity::class.java, Bundle())

            R.id.btn_register -> this extChangeLoginFragment RegisterFragment()
        }
    }
}
