package com.example.kotlinconcepts.kotlinprogramming.handlenullvalue

fun main(args: Array<String>) {
    var name:String="kotlin"
    var b:String?=null
    println("$name ${name.length}")
    try {
        print("$b ${b!!.length}")
    }catch (e:KotlinNullPointerException){
      print("jdfhgdkhjgkdf")
    }
}