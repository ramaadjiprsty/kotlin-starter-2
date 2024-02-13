package com.dicoding.kotlin.oop.functional

fun main() {
    printName("Academy", lambda3)
    //cara 2
    printName("Academy"){ value ->
        val first = "Dicoding"
        "$first $value"
    }
}

fun printName(value: String, lambda3: (String) -> String) {
    println(lambda3(value))
}

val lambda3: (String) -> String = { value ->
    val first = "Dicoding"
    "$first $value"
}

fun findHiddenGames(game: (String) -> Unit) {game("Hi Rama")}