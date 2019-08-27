package com.kotlinseries.ch2_with

import android.widget.TextView
import com.kotlinseries.DataClass

class WithClass(val text:TextView,val text2:TextView) {

    fun start(){
        val data = DataClass("xyz", "25")


        text.text = data.fullName
        text2.text = data.age


        with(data) {
            text.text = fullName
            text2.text = age
        }

    }
}