package com.kotlinseries.ch4_run

import com.kotlinseries.DataClass


class RunExample {


    fun start(){
        val firstPerson = DataClass("first","25")
        val secondPerson = DataClass("second","26")

        val olderPerson = if (firstPerson.age >= secondPerson.age) firstPerson else secondPerson

        olderPerson.printData()

        // with run

        run {
            if (firstPerson.age >= secondPerson.age) firstPerson else secondPerson
        }.printData()


    }
}