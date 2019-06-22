package com.example.kotlinconcepts.kotlinprogramming.handlenullvalue

fun main(args: Array<String>) {
    var name:String
    println("number is")


    var exampleData=ExampleData("ramanuj")
    println(exampleData.str)

    var exampleData2:ExampleData2?=ExampleData2(null)
   // var exampleData2:ExampleData2?=null
   //  println(exampleData2?.str)

    var myExample:ExampleData2?=null
    var c=(myExample?.num)?.plus(7)
    var d=c?.plus(8)
    print(d)
}