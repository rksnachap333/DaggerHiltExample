package me.rajesh.daggerhiltexample.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import me.rajesh.daggerhiltexample.UserRepository
import javax.inject.Inject
import javax.inject.Named


@HiltAndroidApp
class MyApplication: Application() {

    @Inject
    @Named("sql")
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()
        userRepository.saveUser("rajesh@gmail.com", "1234")
    }
}