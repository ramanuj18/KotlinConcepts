package com.example.kotlinconcepts.kotlinprogramming.loopstatement

import java.util.function.Consumer


fun main(args: Array<String>) {
    var productList= arrayListOf<String>()
    productList.add("Mouse")
    productList.add("Monitor")
    productList.add("Keyboard")

    for(it in productList){         //access list item using for loop
        println(it)
    }
    println()

    var it=productList.iterator()       //access list item using iterator
    while (it.hasNext()){
        var obj=it.next()
        println(obj)
    }
    println()

    //we can use forEach method by implement consumable interface but it require min api level 24 so we use here forEach by lambda expression.
    productList.forEach {obj->          //access list item using foreach method
        println(obj)
    }
    println()
    productList.reverse()
    println(productList)

}