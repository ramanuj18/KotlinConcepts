package com.example.kotlinconcepts.kotlinprogramming.inheritance

open class A(val name:String) {
    init {
        println(" constructor called")
    }
    open fun show(){
        println("$name from show()")
    }
}