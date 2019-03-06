package com.example.kotlinconcepts.kotlinprogramming.constructor

class Example(){
    init {
        println("primary constructor")
    }
    lateinit var name:String

    constructor(a:Int,b:Int):this(){
        name="ramanuj"
        printValues(a,b)
    }

    private fun printValues(a:Int,b:Int){
        println("values is $a,$b $name")
    }
}
fun main(args: Array<String>) {
    val example=Example()
    val exp=Example(4,85)
}