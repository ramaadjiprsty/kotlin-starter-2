package com.dicoding.kotlin

/**
 * Vararg atau variable argument membuat kita bisa menyederhanakan bebrapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal
 * dengan vararg sebuah fungsi dapat memiliki jumlah parameter berdasrkan jumlah argumen yang kita masukkan ketika memanggil fungsi tersebut
 * konsepnya mirip dengan array, dan bisa memanngil fungsi atau properti array pada vararg\
 * TIDAK BOLEH MEMLIKI 2 PARAMETER VARARG
 * PENEMPATAN VARARG SEBAIKNYA BERADA DI POSISI TERAKHIR PARAMETER
 * BISA DITEMPATKAN DI AWAL, NAMUN KETIKA MEMANGGIL PARAMETER TANPA VARARG HARUS MENGGUNAKAN NAMED ARGUMENT
 */

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getSizeNumbers(vararg number: Int): Int {
    return number.size
}

fun main() {
    val numbers = sumNumbers(10, 20, 40, 10)
    println(numbers)
    val numbers2 = getSizeNumbers(10, 10, 10)
    println(numbers2)
    val numbers3 = arrayOf(1, 2, 3, 4)
    sets(numbers3)
}

//Karena semua argumen ditampadg di dalam sebuah Array, akan muncul pertanyaan, "Apa bedanya ketika kita menggunakan Array sebagai tipe parameter?" Misal seperti berikut:

fun sets(number: Array<Int>) {

}

//Dari sini kita bisa lihat langsung letak perbedaannya di mana. Ketika fungsi di atas dipanggil, fungsi tersebut membutuhkan argumen berupa nilai yang sudah berbentuk Array seperti berikut: liat fun main

//Berbeda ketika kita menggunakan vararg, kita bisa memasukkan argumen satu persatu. Lalu apakah bisa kita memasukkan nilai yang sudah berbentuk Array sebagai argumen untuk parameter yang ditandai dengan vararg?
//
//Tentu bisa! Dengan memanfaatkan spread operator (*) seperti berikut : LIHAT FUN MAIN
//Dalam penggunaannya, spread operator ditempatkan sebelum nama variabel yang ingindilampirkan.

