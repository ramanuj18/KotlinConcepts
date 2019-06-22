package com.example.kotlinconcepts.kotlinprogramming.`class`

class Keyboard(price:String,brand:String){
    var price:String?=null
    var brand:String?=null
    init {
        this.price=price
        this.brand=brand
    }
}

fun main(args: Array<String>) {
    var keyboard=Keyboard("360","Logitech")

    println("${keyboard.brand} ${keyboard.price}")
}