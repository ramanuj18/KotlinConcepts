package com.example.kotlinconcepts.kotlinprogramming.constructor

open class Parent{
    constructor(name:String){
        println("name is $name from super")
    }
    constructor(name:String,age:Int){
        println("name is $name age is $age from super")
    }

    constructor()
}
class Child:Parent{
           constructor(name:String):super(name){
               println("name is $name")
           }
    constructor(name:String,age:Int):super(name,age){
        println("name is $name age is $age")
    }
}

fun main(args: Array<String>) {
    Child("Ramanuj")
    Child("Ramanuj",22)
}