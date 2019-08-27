package com.kotlinseries.ch5_coroutine

import android.widget.TextView
import kotlinx.coroutines.*
import java.net.URL


class SuspendedFunction(val textView:TextView) {
    fun start(){
        //callWithAsyn()
        callWithContextSwitching()

    }

    private fun callWithAsyn() {
        GlobalScope.launch(Dispatchers.Main) {
            val data = async(Dispatchers.IO) { getData() }
            textView.text = data.await()
        }
    }

    private fun callWithContextSwitching() {
        GlobalScope.launch(Dispatchers.Main) {
            var data = ""
            withContext(Dispatchers.IO){
                data = getData()
            }
            textView.text = data
        }
    }
}


/*
    # Suspend function is a function that could be started, paused and resume.
    # Suspend functions are only allowed to be called from a coroutine or another suspend function
 */
//fetch data on IO thread
suspend fun getData():String{
    return URL("https://jsonplaceholder.typicode.com/todos/1").readText()
}

