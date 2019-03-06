package com.example.kotlinconcepts.kotlinprogramming.constructor

class Person(fName:String="UNKNOWN",_age:Int=0){
    private val firstName=fName.capitalize()
    private val age=_age
    init {
        println("name is $firstName age is $age")
    }
}

fun main(args: Array<String>) {
    val person=Person()
    Person("Ramanuj")
    Person("Ramanuj",22)
}