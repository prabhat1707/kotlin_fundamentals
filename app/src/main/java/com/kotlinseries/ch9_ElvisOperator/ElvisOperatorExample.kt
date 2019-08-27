package com.kotlinseries.ch9_ElvisOperator

import android.util.Log

class ElvisOperatorExample {
    val list: ArrayList<String>? = null

    fun start(){

        list?.let {
            print(it[0])
        } ?: kotlin.run {
           Log.v("Elvis","empty class")
        }
    }
}