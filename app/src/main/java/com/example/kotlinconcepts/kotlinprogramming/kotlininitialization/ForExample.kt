package com.example.kotlinconcepts.kotlinprogramming.kotlininitialization

class A{

    var age:Int?=null
    fun show(){
        println("age is $age")
    }
}

fun main(args: Array<String>) {
    val a=A()
    a.show()
}