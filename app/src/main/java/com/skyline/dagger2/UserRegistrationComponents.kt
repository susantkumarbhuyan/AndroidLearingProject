package com.skyline.dagger2

import dagger.Component

@Component
interface UserRegistrationComponents {
fun getUserRegistrationService(): UserRegistrationService
}