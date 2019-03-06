package com.example.kotlinconcepts.kotlinprogramming.kotlininitialization

class Person{
    val name:String by lazy { "Ramanuj" }       //invoke when we use this variable only for val
    val name1:String="Ramanuj"
    fun show(){
        println("name is $name $name1")
    }
}

fun main(args: Array<String>) {
    val person=Person()
    person.show()
}