package com.kotlinseries.ch1_extention_function

import com.kotlinseries.printLog

class ExtentionProperties {
    val String.moreThenSix:String
    get() {
        if (isEmpty()) throw NoSuchElementException("String sequence is empty.")
        if (length < 6) throw NoSuchElementException("String length is less than 6.")
        return this
    }

    fun start(){
        printLog("12345".moreThenSix)
    }
}