package com.dicoding.kotlin

fun main() {
    //sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluatiion. jika eager evalution mengevaluasi  seluruh item yang ada pada collection, lazy evaluation hanya akan mengevaluasi item jka benar2 diperlukan, misal, ada collection dgn data berjumlah 10 atau 100, itu mungkn tdk akan member pengaruh besar terhadap performa program, namun apa yang terjadi jika data  yang ada pada collection mencapai ratusan riby atau jutaan? waktu proses pada sebuah program bertambah signifikan jikasemua data harus dievaluasi

    val list = (1..10000).toList()
    val number = list.filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)
    println("==============")
    //Pada contoh kode di atas, kita memiliki data collection sejumlah 1 juta item, kemudian masing-masing data akan disaring berdasarkan angka yang merupakan kelipatan 5 lalu dikalikan 2 dan akhirnya ditampilkan satu data pertama pada konsol. Dengan eager evaluation atau dikenal dengan horizontal evaluation, list akan menyelesaikan proses filter terhadap 1 juta data baru kemudian melakukan mapping data sampai akhirnya ditampilkan pada konsol.

    //dengan menerapkan lazy atau vertical evaluation, kita perlu mengubah list menjadi sequence, caranya sangat sederhana yaitu dengan memanggil fungsi asSequence()
    val number2 = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number2)
    println("=============")
    /*
     Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1. Karena tidak memenuhi kondisi pada filter, operasi tidak akan dilanjutkan ke map(). Sampai dengan iterasi ke-5 akan dilakukan mapping, angka 5 akan dikalikan
     2. Karena data pertama, ia akan ditampilkan pada konsol. Setelah itu tidak akan dilanjutkan ke iterasi berikutnya karena kondisi sudah terpenuhi.
     */

    //Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence().
    val sequenceNumber = generateSequence(2) { it*2 }
    //Pada kode di atas kita telah membuat variabel sequenceNumber dengan menggunakan fungsi generateSequence() Fungsi ini memiliki 2 parameter. Parameter pertama adalah item pertama yang ada di dalam collection. Pada contoh kode tadi, setiap item merupakan item sebelumnya ditambah 1. Fungsi generateSequence() akan membuat collection sequence secara tak terbatas. Alhasil, kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop.
    sequenceNumber.take(5).forEach { print("$it ") }


}