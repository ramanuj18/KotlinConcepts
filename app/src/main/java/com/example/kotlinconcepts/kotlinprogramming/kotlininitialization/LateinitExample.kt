package com.example.kotlinconcepts.kotlinprogramming.kotlininitialization

import kotlin.properties.Delegates

class Parent{

    lateinit var address:String              //lateinit for non-primitive data type  for non-primitive vars
    var age:Int by Delegates.notNull()      //like lateinit for primitive data type  for vars
    lateinit var name:String
    fun show(){
        age=20
        name="ramanuj"
        println("name is $age")
    }
}

fun main(args: Array<String>) {
    var parent:Parent?=null
    parent=Parent()
    parent?.show()
}