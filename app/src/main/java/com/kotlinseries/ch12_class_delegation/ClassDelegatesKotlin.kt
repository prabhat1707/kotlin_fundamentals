package com.kotlinseries.ch12_class_delegation

class ClassDelegatesKotlin {
    fun start() {
        val employee = Employee(Designer(), Coders())
        employee.code()
        employee.design()
    }
}

internal class Employee(des: WhoCanDesign, code: WhoCanCode) : WhoCanDesign by des, WhoCanCode by code


