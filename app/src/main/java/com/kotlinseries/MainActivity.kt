package com.kotlinseries

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlinseries.ch1_extention_function.ExtentionProperties
import com.kotlinseries.ch1_extention_function.OperatorFunction
import com.kotlinseries.ch4_coroutine.SuspendedFunction
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //OperatorFunction().start()
        //ExtentionProperties().start()
        SuspendedFunction(response_textView).start()
    }
}

fun printLog(o:Any){
    Log.i("Kotlin_Series", o.toString())
}

