package com.example.kotlinconcepts.kotlinprogramming.`interface`

interface Student{
    val num:Int
    get()=50

    val count:Int
       get() = 89
    fun dispMessage()
}
fun main(args: Array<String>) {
    var student= object :Student{
        override fun dispMessage() {
           println("hello from main method")
        }
        override val num: Int
            get() = 90
    }
    student.dispMessage()
    println(student.num)
    println(student.count)
}