package com.onurtasdemir.uberexample.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.onurtasdemir.uberexample.R
import com.onurtasdemir.uberexample.util.extRegisterUser
import com.onurtasdemir.uberexample.util.extShowToastMessage
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment(R.layout.fragment_register), View.OnClickListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_register.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btn_register -> this.extRegisterUser()
        }
    }
}
