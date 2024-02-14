package com.dicoding.kotlin.functional

val sum2: (Int, Int, Int ) -> Int = ::count
fun count(valueA: Int, valueB: Int, valueC: Int) : Int {
    return valueA + valueB + valueC
}
// ::count adl referensi ke fungsi yang akan dijadikann nilai utk variable sum2
/*
Kode di atas ditulis dengan mekanisme Reflection yang berarti seperangkat fitur bahasa dan library yang memungkinkan kita untuk mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung.
 */

fun isEvenNumber(number: Int) = number % 2 == 0
/*
    kita bisa menggunakan operator :: untuk menggunakannya sebagai instances dari function type, misal penggunaan fungsi filter() yang menjadi bagian dari kelas List
 */

fun main() {
    count(10,20, 30)
    println("=========================")
    val numbers = 1..10 //1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)
    println("=========================")
    //mereferensikan ext fun
    val evenNumber2 = numbers.filter(Int::isEvenNumber2)
    println(evenNumbers)
    println("=========================")
    println(::propRef.name)
    println(::propRef.get())

    ::propRef.set("Belajar Kotlin")

    println(::propRef.get())
}

//kita juga bisa mereferensikan sebuah extensions function dengan cara menyertakan objek yang menjadi receivernya sebelum operator ::, misal

fun Int.isEvenNumber2() = this % 2 == 0

//PROPERTY REFERENCES, :: jg bisa digunakan untuk mereferensikan sebuah properti, jd kita bisa mengakses apa yang menjadi bagian properti tsb spt nama, getter, setter dll

var propRef = "Contoh Property References"

//bila menggunakan val hanya bisa mengakses fungsi get()