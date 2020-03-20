package com.onurtasdemir.uberexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.onurtasdemir.uberexample.R
import com.onurtasdemir.uberexample.fragment.HomeFragment
import com.onurtasdemir.uberexample.fragment.ProfileFragment
import com.onurtasdemir.uberexample.fragment.SettingsFragment
import com.onurtasdemir.uberexample.util.extChangeDashboardFragment
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        this extChangeDashboardFragment HomeFragment()
        bottom_navigation.selectedItemId = R.id.menuHome
        bottom_navigation.setOnNavigationItemSelectedListener {
            return@setOnNavigationItemSelectedListener when (it.itemId) {
                R.id.menuHome -> {
                    this extChangeDashboardFragment HomeFragment()
                    true
                }
                R.id.menuProfile -> {
                    this extChangeDashboardFragment ProfileFragment()
                    true
                }
                R.id.menuSettings -> {
                    this extChangeDashboardFragment SettingsFragment()
                    true
                }
                else -> false
            }
        }
    }
}

