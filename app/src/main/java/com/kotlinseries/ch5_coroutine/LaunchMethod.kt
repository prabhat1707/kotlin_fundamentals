package com.kotlinseries.ch5_coroutine

import android.widget.TextView
import com.kotlinseries.printLog
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext



class LaunchMethod(val textView:TextView):CoroutineScope {
    var job:Job = Job()

    val handler = CoroutineExceptionHandler { _, exception ->
        //Log.d(TAG, "$exception handled !")
        printLog("$exception handled !")
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job + handler

    fun start() {

    }


}

