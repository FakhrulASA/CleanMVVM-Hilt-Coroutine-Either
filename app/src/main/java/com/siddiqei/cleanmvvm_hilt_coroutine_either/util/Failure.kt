package com.siddiqei.cleanmvvm_hilt_coroutine_either.util

const val NO_INTERNET="Your device is not connected with internet"
const val WENT_WRONG="Opps! Something went wrong."
sealed class Failure {
    companion object{
        fun getNoInternetFailure():String="Internet not available"
    }

    class NetworkConnection(val message:String = NO_INTERNET):Failure()
    class Exception(val message: String= WENT_WRONG):Failure()
}