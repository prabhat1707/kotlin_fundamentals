package com.kotlinseries.ch11_infix

class InfixExample {
    infix fun Int.add(a:Int){
        this + a
    }

    fun start(){
        print(4 add 4)
    }
}