package me.rajesh.daggerhiltexample

import android.util.Log
import javax.inject.Inject


interface UserRepository {
    fun saveUser(email : String, pass : String)
}

class SQLRepository @Inject constructor(): UserRepository {

    companion object{
        const val TAG = "SQLRepository"
    }


    override fun saveUser(email : String, pass : String) {
//        loggerService.log("User saved with email $email and password $pass")

        Log.d(TAG, "User saved with email $email and password $pass")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {

    companion object{
        const val TAG = "FirebaseRepository"
    }

    override fun saveUser(email: String, pass: String) {
        Log.d(TAG, "User saved with email $email and password $pass")
    }

}

//class UserRepository @Inject constructor(val loggerService: LoggerService) {
//
//    companion object{
//        const val TAG = "UserRepository"
//    }
//
//
//    fun saveUser(email : String, pass : String) {
//        loggerService.log("User saved with email $email and password $pass")
//    }
//}