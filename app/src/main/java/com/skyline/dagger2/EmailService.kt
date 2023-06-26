package com.skyline.dagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sentMail(email: String, form: String, topic: String) {
        Log.d("TAG", "User Saved")
    }
}