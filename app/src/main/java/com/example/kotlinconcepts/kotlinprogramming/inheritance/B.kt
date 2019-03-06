package com.example.kotlinconcepts.kotlinprogramming.inheritance

class B(name:String):A(name) {
    fun display(){
        println("$name from display()")
    }
}