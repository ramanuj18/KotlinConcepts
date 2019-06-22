package com.example.kotlinconcepts.kotlinprogramming.handlenullvalue

fun main(args: Array<String>) {
    var product=Product("monitor",null)
    println(product.name)

    var str:String?=null
    print("hello ${str?.toInt()}")

}