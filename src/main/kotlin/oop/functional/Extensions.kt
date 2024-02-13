package com.dicoding.kotlin.oop.functional

fun main() {
    val dicoding = "Dicoding".firstAndLast()
    val first = dicoding["first"]
    val last = dicoding["last"]
    println("Pertama $first, Terakhir $last")
    println("=====================")
    val namaku = "Rama Adji"
    println("${namaku.first()}, ${namaku.last()}")
}

fun String.firstAndLast(): Map<String, Char>{
    return mapOf(
        "first" to first(),
        "last" to last()
    )
}