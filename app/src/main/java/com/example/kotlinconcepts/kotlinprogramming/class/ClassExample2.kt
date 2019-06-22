package com.example.kotlinconcepts.kotlinprogramming.`class`

open class Abc{
     var name:String?=null
     var city:String?=null

    constructor(name:String,city:String){
        this.name=name
        this.city=city
    }
}

class Xyz:Abc{
    var name1:String?=null
    var city1:String?=null
    var address1:String?=null
    constructor(name1:String,city1:String,address1:String):super(name1,city1){
        this.name1=name1
        this.city1=city1
        this.address1=address1
    }
}
fun main(args: Array<String>) {
    var xyz=Xyz("John","Indore","Vijay Nagar")
    println("name :${xyz.address1}")
}