package com.kotlinseries.ch6_reified

import android.content.Context
import android.content.Intent
import com.kotlinseries.MainActivity

class ReifiedExmaple(val ctx:Context) {
    fun start(){
        ctx.openActivity(MainActivity::class.java)
        ctx.openActivityByReified<MainActivity>()
    }

    // without reified

    fun <T> Context.openActivity(it: Class<T>) {
        val intent = Intent(this, it)
        startActivity(intent)
    }

    // with reified

    inline fun <reified T:Any> Context.openActivityByReified() {
        val intent = Intent(this, T::class.java)
        startActivity(intent)
    }


}