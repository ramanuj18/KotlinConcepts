package com.example.kotlinconcepts.kotlinprogramming.objectwithanonymous

open class Person{
    fun show(){
        println("show called from person")
    }
    open fun display(){
        println("display called from person")
    }
}

fun main(args: Array<String>) {
    var person=object :Person(){            //object keyword is used for anonymous implementation of class
        override fun display() {
            println("display called from anonymous")
        }
    }
    person.display()
    person.show()
}
