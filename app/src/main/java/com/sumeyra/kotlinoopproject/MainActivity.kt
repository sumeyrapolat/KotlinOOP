package com.sumeyra.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //classes and functions
        var myUser =User("Sümeyra",23)
        //myUser.name="Sümeyra"
        //myUser.age =23
        myUser.name="Sümeyra Polat"
        myUser.age  =24

        //poli example
        println(myUser.information())

        println(myUser.age.toString())
        println(myUser.name)


        //inheritance

        var james = Musicians("james","guitar",55)
        println(james.age.toString())

        var lars = superMusicians("Lars","Drums",60)
        println(lars.name)
        println(lars.age)
        lars.sing()

        //Polymorphism
        // --> 1) Static Polymorphism

        var math = Mathematics()
        println(math.sum())
        println(math.sum(12,36))
        println(math.sum(12,36,48))

        // --> 2) Dynamic Polymorphism
        val animal = animal()
        animal.meow()

        val lili = Cat()
        lili.test()
        lili.meow()


        //absraction && interface

        //abstract classların bir instance ını oluşturamazsın
        //val myPeople = People()

        var myPiano = Piano()
        myPiano.brand="yamaha"
        myPiano.info()
        myPiano.digital= false
        println(myPiano.roomname)

        //Lambda Expressions
        //BEFORE
        fun printString(myString: String){
            println(myString)
        }

        printString("before lambda")

        //AFTER
        val testString = {myString: String -> println(myString)}
        testString("My lambda String")

        val multiply= {a: Int, b:Int -> a*b}
        println(multiply(80,7))

    }
}