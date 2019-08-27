package com.kotlinseries.ch3_let

import android.widget.TextView
import com.kotlinseries.DataClass

class LetClass(val text: TextView, val text2: TextView) {
    private var data: DataClass? = null


    fun start(){
        if (data != null) {
        }
        //or
        data?.let { }

        data?.let {
            with(it) {
                text.text = fullName
                text2.text = age
            }
        }

    }
}

