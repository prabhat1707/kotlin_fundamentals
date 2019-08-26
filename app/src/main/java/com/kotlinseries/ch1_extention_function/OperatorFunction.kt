package com.kotlinseries.ch1_extention_function

import android.util.Log

class OperatorFunction{

    fun start(){
        val data = Holder(10,20) + Holder(20,30)
        Log.v("Operator_function","------------>"+data.a)
    }
}

data class Holder(val a:Int,val b:Int)


operator fun Holder.plus(other:Holder):Holder{
    return Holder(a + other.a,b+other.b)
}