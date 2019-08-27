package com.kotlinseries

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlinseries.ch9_ElvisOperator.ElvisOperatorExample

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //OperatorFunction().start()
        //ExtentionProperties().start()
        //SuspendedFunction(response_textView).start()
       // RetrofitCoroutine(response_textView).startWithAsync()
        //AsyncCoroutine().start()
//        ReifiedExmaple(this).start()
       // TailRecExample().start()
        ElvisOperatorExample().start()

    }
}

fun printLog(o:Any){
    Log.i("Kotlin_Series", o.toString())
}

