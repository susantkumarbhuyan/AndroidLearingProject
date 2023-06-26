package com.skyline.dagger2

import android.util.Log
import com.google.android.material.tabs.TabLayout.TabGravity
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.d("TAG", "User Saved")
    }
}