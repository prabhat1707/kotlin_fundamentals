package com.kotlinseries.ch8_tailrec

import java.math.BigInteger

class TailRecExample {
    fun start(){
       print(factorialWithTailRec(100000, BigInteger("1"),BigInteger("0")))
    }

    tailrec fun factorialWithTailRec(num:Int,a:BigInteger,b:BigInteger): BigInteger {
        return if (num == 0) b else factorialWithTailRec(num-1,a+b,a)
    }

    fun factorialWithOutTailRec(num:Int,a:BigInteger,b:BigInteger):BigInteger{
        return if (num == 0) b else factorialWithOutTailRec(num-1,a+b,a)
    }
}