package com.sumeyra.kotlinoopproject

open class Musicians(name: String, instrument: String, age: Int) {
    //ENCAPSULATION (i encapsulate my propertry in my class and i set which one is private to set or get)

    var name :String ? = name
        private set
        get

    var instrument : String?= instrument

    var age : Int? = age
        private set
        get



}