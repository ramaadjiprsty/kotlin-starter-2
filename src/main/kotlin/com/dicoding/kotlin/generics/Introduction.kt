package com.dicoding.kotlin.generics

/**
 * kotlin termasuk bahasa statically typed yang artinya ketika kita menambahkan variabel baru, scr otomatis variabel tsb akan dikenali pada saat kompilasi
 * scr umum generic adl konsep untuk menetukan tipe data yang akan digunakan, ditandai dengan tipe parameter, dan juga bisa mengganti tipe param menajadi tipe yang lebih spesifik dengan menentukan instance dari tipe tersebut
 */

//cara kerja generics pada tipe data List
//val contributor = ListOf("Rama", "Adji", "Prasetyo")

//krn data list sudah memiliki data string, kita bisa menghapus tipe parameternya, namun jika kita ingin membuat variable tanpa memilik data kita wajib menentukan scr eksplisit tipe data yang akan digunakan untuk variable tsb

//var contributor2 = ListOf<String>()

//bisa juga mendeklarasikan lebih dari 1 tipe parameter, nmisal menggunakan kelas Map yang memilik dua tipe yaitu value dan key

val points = mapOf<String, Int>()

//MENDEKLARASIKAN KELAS GENERIC

interface List<T>{
    operator fun get(index: Int): T
}

//parameter T bisa kita gunakan sebagai tipe reguler yang mengembalikan tipe dari sebuah fungsi. bisa dikatakan juga sebagai placeholder yang nantinya bisa dibebaskan untuk menentukan tipe dasar yang didukung oleh kode tsb

class LongList: List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

//pd kelas longlist diatas, long digunakan sebagai tipe argumen untuk List sehingga fungsi get() menggunakan long sebagai return type, jika ingin membuatnya menjadi generic, diperlukan menambah kode geeneric untuk membuatnya

class ArrayList<T>: List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

//jika menggunakan argumen generic, kita perlu menentukana tipe argmen saaat menggunakan kelasnya

// val longArrayList = ArrayList<Long>()
// val firstLong = longArrayList.get(0)

//MENDEKLARASIKAN FUNGSI GENERIC
//generic pada sebuah fungsi dibutuhkan ketika kita ingin membuat fungsi yang berhubungan dengan List

//tipe parameter pada fungsi generic ditentukan ketika fungsi tsb dipanggil. deklarasinya cukup beda dengan kelas generic, tipe parameter diletakkan sebelum nama fungsi

//fun <T> run(): T {
//
//}

//contoh deklarasi fungsi slice yang merupakan extension function dr kelas list

fun <T> List<T>.slice(indices: Iterable<Int>) {

}

//fun main() {
//    val numbers = (1..100).toList()
//    println(numbers.slice<Int>(1..100))
//}
