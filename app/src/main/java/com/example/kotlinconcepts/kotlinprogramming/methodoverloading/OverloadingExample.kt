package com.example.kotlinconcepts.kotlinprogramming.methodoverloading

class Student{
    fun sum(){
        println("no parameter")
    }
    fun sum(a:Int){
        println("one parameter $a")
    }
    fun sum(a:Int,b:Int){
        println("two parameter ${a+b}")
    }
    fun sum(a:Int,b:String){
        println("two different parameter $a $b")
    }
}
fun main(args: Array<String>) {
    val student=Student()
    student.sum()
    student.sum(5)
    student.sum(8,9)
    student.sum(4,"abc")
}