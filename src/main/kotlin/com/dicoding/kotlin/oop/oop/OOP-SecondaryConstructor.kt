package com.dicoding.kotlin

/**
 * Secondary constructor digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain. Anda dapat membuat lebih dari satu secondary constructor. Sebagai contoh, kita bisa menambahkan secondary constructor pada kelas Animal:
 */

class Animal6(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = Animal6("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Animal6("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}

/*
output:
    Nama: Dicoding Miaw, Berat: 2.5, Umur: 2, mamalia: true
    Nama: Dicoding tweet, Berat: 0.5, Umur: 1, mamalia: false

    Dengan begitu, objek Animal dapat diinisialisasi dengan secondary constructor ketika nilai name, weight, age dan isMammal tersedia. Tetapi jika nilai isMammal tidak tersedia,  primary constructor lah yang akan digunakan dan nilai isMammal dapat diinisialisasi pada blok init dengan nilai default.
*/

