package com.dicoding.kotlin.oop.functional

fun main() {
    printName("Academy", lambda3)
    //cara 2
    printName("Academy"){ value ->
        val first = "Dicoding"
        "$first $value"
    }
    println("===========================")

    printResult(20, sum)
}

fun printName(value: String, lambda3: (String) -> String) {
    println(lambda3(value))
}

val lambda3: (String) -> String = { value ->
    val first = "Dicoding"
    "$first $value"
}

//variable -> parameter -> nilai return -> blok kode
val higher: (Int) -> Int = {value -> value + value}

val higher2 = {name: String -> println("Hello $name") }

fun findHiddenGames(game: (String) -> Unit) {game("Hi Rama")}

/*
    Tipe deklarasi pada kode di atas adalah contoh ketika kita ingin membuat lambda yang memiliki 1 (satu) parameter bertipen data Int dengan tipe kembalian Int. Untuk tipe deklarasi lainnya, akan kita bahas pada submodul berikutnya.
    Dengan ditetapkannya tipe deklarasi pada fungsi tersebut, memungkinkan kita untuk bisa menggunakannya sebagai argumen untuk fungsi lainnya. Contohnya seperti berikut.
 */

    var sum: (Int) -> Int = {value -> value + value}

    fun printResult(value: Int, sum: (Int) -> Int) {
        val result = sum(value)
        println(result)
    }
    /*
        Konsep ini dinamakan sebagai Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.

        Melanjutkan penulisan kode di atas, kita bisa juga melampirkan isi lambda secara langsung ketika fungsi printResult() di atas dipanggil seperti berikut.

fun main() {
    printResult(10, { value ->
        value + value
    })
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
     */

/*
 Selanjutnya ada konvensi penulisan yang menarik di Kotlin, yakni apabila parameter terakhir pada sebuah fungsi berupa lambda, argumen tersebut dapat dituliskan di luar paranthesis seperti ini.

fun main() {
    printResult(10){ value ->
        value + value
    }
}
 */

/*
    Inline adalah fitur dalam bahasa Kotlin yang memungkinkan Anda untuk menyertakan seluruh kode dari suatu fungsi atau lambda (expression function) pada saat kompilasi, sehingga mempercepat waktu eksekusi program. Apabila kita periksa pada kode yang sudah di-decompile. Hasilnya akan seperti berikut.
 */

inline fun printResult2(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}