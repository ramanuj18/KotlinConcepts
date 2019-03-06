package com.example.kotlinconcepts.kotlinprogramming.visibilitymodifiers

open class Test:Parent(){
    fun help(){
        println("help() called from Test")
        disp1()
        hello()
        show()

    }
}
open class Test1:Test(){
    fun help1(){
        show()
    }
}

class Test2:Test1(){
    fun help2(){
        show()
    }
}

fun main(args: Array<String>) {
    val test=Test2()
    test.help2()
}