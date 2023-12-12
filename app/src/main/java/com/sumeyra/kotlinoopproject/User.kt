package com.sumeyra.kotlinoopproject

class User : People{

    //propertyleri class içinde hapsetme işine encapsulation diyoruz

    //property
    var name: String?= null
    var age: Int?= null

    //constructor VS init
    constructor(name:String,age: Int){
        this.name=name
        this.age=age
        println("secondry")
    }
    init {
        println("its called firstly")
    }


}