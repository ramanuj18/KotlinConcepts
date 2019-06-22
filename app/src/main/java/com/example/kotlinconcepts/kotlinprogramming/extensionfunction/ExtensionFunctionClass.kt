package com.example.kotlinconcepts.kotlinprogramming.extensionfunction

fun String.removeFirstLastChar():String=this.substring(1,this.length-1)

fun main(args: Array<String>) {
    var str="LokSabhaElection"
    println(str)
    print(str.removeFirstLastChar())
}