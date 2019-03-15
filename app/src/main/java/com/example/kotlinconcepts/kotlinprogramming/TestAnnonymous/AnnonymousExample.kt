package com.example.kotlinconcepts.kotlinprogramming.TestAnnonymous


interface Parent{
     fun sum(a:Int,b:Int):Int
}

open class ABC{
   open fun display(){
        println("method called from ABC")
    }
}

fun main(args: Array<String>) {
    val parent=object :Parent{
        override fun sum(a: Int, b: Int): Int {
            return (a+b)
        }
    }
    println(parent.sum(56,45))

    val abc=object :ABC(){
        override fun display(){
            println("method called from anonymous implementation")
        }
    }
    abc.display()
}

