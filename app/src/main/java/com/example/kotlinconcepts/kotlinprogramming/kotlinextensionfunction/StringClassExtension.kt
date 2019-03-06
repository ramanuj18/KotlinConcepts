package com.example.kotlinconcepts.kotlinprogramming.kotlinextensionfunction

fun String.nameFormat(str:String):String{
    return this.substring(1,str.length-1)
}

fun main(args: Array<String>) {
    val name="Ramanuj Kesharawani"
    val _name=name.nameFormat(name)
    println(_name)
}