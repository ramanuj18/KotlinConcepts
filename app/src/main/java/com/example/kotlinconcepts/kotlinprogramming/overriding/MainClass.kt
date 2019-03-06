package com.example.kotlinconcepts.kotlinprogramming.overriding

open class Parent {
    open fun myAge(age:Int){
        println("my age is $age")
    }
}

class Child:Parent() {
    override fun myAge(age:Int){
        println("my fake age is ${age-5}")
    }
}

fun main(args: Array<String>) {
    val child=Child()
    child.myAge(34)
}