package com.sumeyra.kotlinoopproject

class Piano: HouseDecor,Instrument {

    //bir sınıf birden fazla classtan inheritence alamaz ama
    //interfaceden alabilir

    var brand : String? = null
    var digital : Boolean? = null
    override var roomname: String
        get() = "bedroom"
        set(value) {}

    override fun info() {
        println("instrument info")
    }
}