package com.example.kotlinconcepts.kotlinprogramming.supermethod

open class Person {
    open fun myAge(age:Int){
        println("my age is $age")
    }
}

 class Derive:Person(){
     override fun myAge(age: Int) {
         super.myAge(age)
         print("my fake age is ${age-5}")
     }
}

fun main(args: Array<String>) {
    val derive=Derive()
    derive.myAge(34)
}