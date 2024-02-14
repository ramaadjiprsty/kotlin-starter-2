package com.dicoding.kotlin.functional

//inner function berguna untuk mengatasi penulisan kode yang berulang, terlalu panjang atau susah untuk dibaca

//contoh inner function
fun setWord(message: String) {
    fun printMessage(text: String){ //membuat fungsi di dalam fungso
        println(text)
    }
    printMessage(message) //memanggil inner function
}

//dengan inner func kita bisa mengakses apa yang menjadi bagian fungsi terluarnya (setWord), dan parameter dari fungsi setWord bisa diakses dari dalam fungsi print sehingga kode bisa diubah menjadi

fun setWord2(message: String) {
    fun printMessage2() {
        println(message)
    }
    println(printMessage2()) //kdoe menjadi lebih sederhana
}

//inner function hanya bisa diakses ketika sudah di definisikan

//contoh pemanfaatan inner function

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    if (valueA == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }

    if (valueB == 0) {
        throw IllegalArgumentException("valueB must be better than 0")
    }

    if (valueC == 0) {
        throw IllegalArgumentException("valueC must be better than 0")
    }

    return valueA + valueB + valueC
}

//kita bisa menyederhanakan kode diatas yang terlalu banyak pengulangan kode dengan inner function

fun sumInner(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}