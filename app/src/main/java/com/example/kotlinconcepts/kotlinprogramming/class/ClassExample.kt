package com.example.kotlinconcepts.kotlinprogramming.`class`

class Person(val firstName:String,var age:Int){     //primary constructor
    init {
        println("init called")
    }

    constructor(name:String):this(name,30){
        println("name is $name")
    }
}

fun main(args: Array<String>) {
    val person=Person("ramanuj")
    println("person name is ${person.firstName} age is ${person.age}")
}
