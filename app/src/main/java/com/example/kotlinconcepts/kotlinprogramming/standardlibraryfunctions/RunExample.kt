package com.example.kotlinconcepts.kotlinprogramming.standardlibraryfunctions


//Kotlin run expression can change the outer property. Hence in the above code, we’ve redefined it for the local scope.
//Similar to the let function, the run function also returns the last statement.
//Unlike let, the run function doesn’t support the it keyword.
fun main(args: Array<String>) {
    var tutorial="This is Kotlin Tutorial"
    println(tutorial)
    tutorial= run {  tutorial="this is run function"
    tutorial         //last statement return as result
    }
    println(tutorial)

}