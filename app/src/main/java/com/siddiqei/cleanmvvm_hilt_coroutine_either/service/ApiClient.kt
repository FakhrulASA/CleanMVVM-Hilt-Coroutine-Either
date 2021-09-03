package com.siddiqei.cleanmvvm_hilt_coroutine_either.service

import com.siddiqei.cleanmvvm_hilt_coroutine_either.util.Either
import com.siddiqei.cleanmvvm_hilt_coroutine_either.util.Failure
import com.siddiqei.cleanmvvm_hilt_coroutine_either.util.WENT_WRONG
import retrofit2.Call
import javax.inject.Inject

class ApiClient @Inject constructor() {
    fun <T, R> request(
        call: Call<T>,
        transform: (T) -> R,
        default: T,
        postRequest: (R) -> Unit = {}
    ): Either<Failure, R> {
        return try {
            val response = call.execute()
            when (response.isSuccessful) {
                true -> {
                    val transformed = transform((response.body() ?: default))
                    postRequest(transformed)
                    Either.Right(transformed)
                }
                false -> Either.Left(
                    getFailureType(
                        response.code(),
                        response.errorBody()?.string()!!
                    )
                )
            }
        } catch (exception: Throwable) {
            exception.printStackTrace()
            Either.Left(Failure.ExceptionUnauthorized(exception.message ?: WENT_WRONG))
        }
    }

    private fun getFailureType(httpCode: Int, message: String): Failure {
        return when (httpCode) {
            401 -> return Failure.NetworkConnection(message)
            400 -> return Failure.Exception(httpCode, message)
            in 402..409 -> return Failure.Exception(httpCode, message)
            in 500..509 -> return Failure.Exception(httpCode, message)
            else -> Failure.Exception(httpCode, message)
        }
    }

}