package com.example.kotlinconcepts.kotlinprogramming.standardlibraryfunctions

fun main(args: Array<String>) {
   // var p:String?="ramanuj"
    var p:String?=null
    p?.let { println("p is $p") } ?: run { println("p was null. Setting default value to:")
    p="kotlin"}
    println(p)
}