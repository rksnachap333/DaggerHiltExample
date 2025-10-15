package me.rajesh.daggerhiltexample

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {

    companion object{
        const val TAG = "LoggerService"
    }


    fun log(msg : String) {
        Log.d(TAG,"Message is $msg")
    }
}