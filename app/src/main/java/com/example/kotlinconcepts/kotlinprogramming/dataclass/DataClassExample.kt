package com.example.kotlinconcepts.kotlinprogramming.dataclass


//The primary constructor must have at least one parameter.
//The parameters of the primary constructor must be marked as either val (read-only) or var (read-write).
//The class cannot be open, abstract, inner or sealed.
//The class may extend other classes or implement interfaces. If you are using Kotlin version before 1.1, the class can only implement interfaces.

data class Student(var name:String,var address:String,var rollno:Int)

fun main(args: Array<String>) {
    val student=Student("ramanuj","Indore",101)
    println("name is ${student.name} address-${student.address} rollNo is ${student.rollno}")

    val stu=student.copy(address="Bhopal")      //create a copy of object.
    println(stu.toString())

    val s =stu.copy(name = "Anuj")
    println(s.toString())

    val st=s.copy(rollno = 111)
    println(st.toString())
}