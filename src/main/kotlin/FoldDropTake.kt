package com.dicoding.kotlin

fun main() {

    //fold() melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterai item tsb satu persatu menggunakan fungsi fold, misal
    val numbers = listOf(1, 2, 3 ,4, 5)
    val fold = numbers.fold(1) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current+item
    }
    println("fold result = $fold")
    println("==========================")
    //foldRight memilki fungsi yang sama dengan fold, namun fold melakukannya dari indeks terakhir dan ada perbedaan penulisan lambda
    val foldRight = numbers.foldRight(1) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item+current
    }
    println("foldRight Result = $foldRight")
    println("==============================")

    //drop() fungi yang bisa kita manfaatkan untuk memangkas tem yang berada di dalam sebuah objek collection berdasarkan jumlah yang kta tentukan, misal
    val drop = numbers.drop(3) //memangkass 3 item dari indeks pertama collection
    println(drop)
    //untuk memangkas dari indeks akhir bisa menggunakan dropLast()
    val dropLast = numbers.dropLast(3)
    println(dropLast)
    println("==============================")

    //take() kebalikan dari drop, take akan mengambil data sesuai nilai yang ditentukan
    val take = numbers.take(3)
    val takeLast = numbers.takeLast(3)
    println(take)
    println(takeLast)

}