package com.dicoding.kotlin.oop.functional

//recursive function adl sebuah mekanisme dmn fungsi digunakan didalam fungsi itu sendiri

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

//diatas adalah kode menghitung faktorial tanpa recursive, bila menggunakan recursive akan menjadi spt ini

fun factorialWithRecursive(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorialWithRecursive(n-1)
    }

}

fun main() {
    println(factorial(5))
    println("==================")
    println(factorialWithRecursive(5))
}