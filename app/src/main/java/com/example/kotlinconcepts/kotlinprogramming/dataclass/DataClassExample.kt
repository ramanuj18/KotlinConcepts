package com.example.kotlinconcepts.kotlinprogramming.dataclass

data class Student(var name:String,var address:String,var rollno:Int)

fun main(args: Array<String>) {
    val student=Student("ramanuj","Indore",101)
    println("name is ${student.name} address-${student.address} rollNo is ${student.rollno}")

    val stu=student.copy(address="Bhopal")
    println(stu.toString())

    val s =stu.copy(name = "Anuj")
    println(s.toString())

    val st=s.copy(rollno = 111)
    println(st.toString())
}