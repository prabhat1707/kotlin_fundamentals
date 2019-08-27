package com.kotlinseries.ch5_coroutine

import android.util.Log
import android.widget.TextView
import com.kotlinseries.MainActivity
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

class RetrofitCoroutine(val response_text:TextView) : CoroutineScope{
    private lateinit var job: Job
    private var main: MainActivity = MainActivity()
    val handler = CoroutineExceptionHandler { _, exception ->
        Log.d("test", "$exception handled !")
    }

    init {
        job = Job()
    }
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job + handler

    fun start(){
        val service = RetrofitFactory.makeRetrofitService()

        launch {
            val response = withTimeout(TimeUnit.SECONDS.toMillis(10)){service.getPosts()}
            withContext(Dispatchers.Main){
                response_text.text = response.body()
            }

        }
    }

     fun startWithAsync(){
        val service = RetrofitFactory.makeRetrofitService()
         val time = measureTimeMillis {
             val response = async(Dispatchers.IO) { service.getPosts() }
             launch {
                 response_text.text = response.await().body()
             }
         }
         print(time)
    }


}