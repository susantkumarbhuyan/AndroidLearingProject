package com.skyline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skyline.dagger2.DaggerUserRegistrationComponents
import com.skyline.dagger2.UserRegistrationComponents
import dagger.internal.DaggerGenerated

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val compo = DaggerUserRegistrationComponents.create().getUserRegistrationService()
        compo.registerUser("susant@hs.com", "Susant")
    }
}