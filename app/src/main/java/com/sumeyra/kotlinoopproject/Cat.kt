package com.sumeyra.kotlinoopproject

 class Cat: animal() {

     fun test(){
         super.meow()
     }
     override fun meow(){
        println("Cat Class !!")
    }

}