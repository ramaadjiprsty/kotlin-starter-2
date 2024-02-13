package com.dicoding.kotlin.oop.functional

fun main() {
    var sum: (Int) -> Int = {value -> value+value}
    println(sum(10))
    println("=============")
    println(lambda1())
    println("=============")
    println(lambda2("Academy"))


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