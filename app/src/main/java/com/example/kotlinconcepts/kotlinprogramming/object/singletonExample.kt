package com.example.kotlinconcepts.kotlinprogramming.`object`

object Singleton{
    private var name:String?=null
    init {
        name ="Ramanuj"
        println("called")
    }

    fun getMyName():String?{
        return name
    }
}
fun main(args: Array<String>) {
    println(Singleton.getMyName())
}