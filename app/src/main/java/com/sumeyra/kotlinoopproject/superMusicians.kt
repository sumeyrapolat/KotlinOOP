package com.sumeyra.kotlinoopproject

class superMusicians(name: String, instrument: String, age: Int) :
    Musicians(name, instrument, age) {
        fun sing(){
            println("nothing else matter")
        }
}