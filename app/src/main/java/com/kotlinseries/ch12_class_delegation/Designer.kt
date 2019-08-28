package com.kotlinseries.ch12_class_delegation

class Designer:WhoCanDesign {
    override fun design() {
        print("design")
    }
}