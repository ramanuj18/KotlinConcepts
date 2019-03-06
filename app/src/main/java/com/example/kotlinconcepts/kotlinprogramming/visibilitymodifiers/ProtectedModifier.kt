package com.example.kotlinconcepts.kotlinprogramming.visibilitymodifiers

open class Parent{
    protected fun show(){           //protected only accessed from its derive class its also accessible in multilevel inheritance
        println("show() called from parent")
        disp()
    }
    private fun disp(){             //accessible within class
        println("disp() called from parent")
    }

    internal fun hello(){
        println("hello() called from parent")
    }

    fun disp1(){
        println("disp1() called from parent")
    }
}

class Derive:Parent(){
    fun display(){
        show()
        println("display() called from Derive")
    }
}

fun main(args: Array<String>) {
    val derive=Derive()
    derive.display()
    derive.hello()
}