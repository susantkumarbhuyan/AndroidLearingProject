package com.skyline.dagger2

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepo : UserRepository, private val emailService: EmailService){

    fun registerUser(email: String, password: String){

    }
}