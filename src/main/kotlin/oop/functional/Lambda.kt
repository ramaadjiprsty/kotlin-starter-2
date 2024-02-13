package com.dicoding.kotlin.oop.functional

fun main() {
    var sum: (Int) -> Int = {value -> value+value}
    println(sum(10))
    println("=============")
    println(lambda1())
    println("=============")
    println(lambda2("Academy"))
    println("==============")
    println(greet("Rama"))
    println("==============")
    printMesssage("AIUEO")
    println("==============")
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
    println("==============")
    val ranges2 = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}

}

val lambda1 = {
    val first = "Dicoding"
    val last = "Academy"
    "$first $last"
}

val lambda2: (String) -> String = { value ->
    val first = "Dicoding"
    "$first $value"

}

val greet: (String) -> String = { name: String ->
    "Hello $name"
}

val printMesssage = {message: String -> println(message)}

