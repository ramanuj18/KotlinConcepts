package com.example.kotlinconcepts.kotlinprogramming.`object`

object MyDatabase {
    private var a:Int =0
    var b:Int=1

    fun singleton():Int{
        a=25
        return a
    }
}

fun main(args: Array<String>) {
    val result=MyDatabase.singleton()

    println("${MyDatabase.b}")
    println(result)
}