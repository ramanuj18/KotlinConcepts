package com.example.kotlinconcepts.kotlinprogramming.inheritanceTest

open class Parent(val name :String){
    fun sum(a:Int,b:Int):Int{
        return a+b
    }
}

class Derive : Parent("Rama"){
    fun add(a:Int,b:Int):Int{
        return sum(a,b)
    }
}

fun main(args: Array<String>) {
  //  var parent=Parent("rama")
   // println(parent.sum(4,5))

    var derive=Derive()
    println(derive.add(4,5))
}