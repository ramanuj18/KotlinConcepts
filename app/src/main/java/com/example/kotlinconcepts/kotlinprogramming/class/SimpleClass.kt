package com.example.kotlinconcepts.kotlinprogramming.`class`

class Student(){
    var name:String?=null
    var rollNo:String?=null
    constructor(name:String,rollNo:String):this(){
        this.name=name
        this.rollNo=rollNo
    }
    fun disp(){
       println("name is $name and rollNo is $rollNo")
    }
}

fun main(args: Array<String>) {
   // var student=Student("ramanuj","101")
    var student=Student()
    student.disp()
}