package com.example.kotlinconcepts.kotlinprogramming.objectwithanonymous

interface Parent{
    fun add(a:Int,b:Int):Int
    fun sum(a:Int,b:Int):Int{
        return a
    }
}

fun main(args: Array<String>) {
    var parent=object :Parent{
        override fun add(a: Int, b: Int): Int {
           return a+b
        }

        override fun sum(a: Int, b: Int): Int {

            return a+b
        }
    }
    println(parent.add(45,56))
    println(parent.sum(23,34))
}