package com.skyline.dagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.d("TAG", "User Saved")
    }
}