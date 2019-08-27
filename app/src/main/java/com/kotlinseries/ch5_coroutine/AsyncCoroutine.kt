package com.kotlinseries.ch5_coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class AsyncCoroutine {

    fun start(){
        val time = measureTimeMillis {
            runBlocking {
                val first = async { firstNumber() }
                val second = async { secondNumber() }
                val third = async { thirdNumber() }

                val result = first.await() + second.await() + third.await()
            }
        }

        println(time)
    }

    suspend fun firstNumber(): Int {
        delay(3_000) // 3 seconds delay
        return 3
    }
    suspend fun secondNumber(): Int {
        delay(5_000) // 5 seconds delay
        return 5
    }
    suspend fun thirdNumber(): Int {
        delay(7_000) // 7 seconds delay
        return 7
    }
}