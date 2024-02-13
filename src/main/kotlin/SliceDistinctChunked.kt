package com.dicoding.kotlin

fun main() {
    //slice bisa menyaring item dari posisi tertentu, slice membutuhkan sebuah argumen berupa range yang digunakan untuk menentukan posisi pertama dan terakhir yang akan disaring
    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = number.slice(3..6)
    println(slice)
    println("============")
    //krn menggunakan range kita bisa menggunakan operator step pd argumennya
    val stepSlice = number.slice(2..8 step 2)
    println(stepSlice)
    println("============")
    //untuk menentukan posisi yang lebih spesifik kita bisa mendefiniskannya dalam collection lalu sematkan d dalam argumennya
    val index =  listOf(3, 5, 7, 8)
    val indexSlice = number.slice(index)
    println(indexSlice)
    println("============")
    //Kita harus berhati-hati dalam menentukan cakupan index untuk mendapatkan data. Karena dapat menyebabkan terjadinya ArrayIndexOutOfBoundsException jika posisi yang ditentukan tidak terdapat pada objek collection.

    //distinct berguna untuk menyaring item yang memiliki duplikasi
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()
    println(distinct)
    println("===========")

    //Sama halnya seperti beberapa fungsi sebelumnya yang sudah dibahas, fungsi distinct() bisa langsung dipanggil dari objek collection. Kita juga bisa menggunakannya pada collection dengan tipe parameter seperti data class. Misal seperti berikut:
    data class Item(val key: String, val value: Any)
    fun dist() {
        val Item = listOf("3", "Programming")
        Item("3", "Language")
        val items = listOf(
            Item("1", "Kotlin"),
            Item("2", "is"),
            Item("3", "Awesome"),
            Item("4", "as"),

        )
        val distinctItems = items.distinctBy { it.key }
        distinctItems.forEach{
            println("${it.key} with values ${it.value}")
        }

    }
    dist()
    println("==================")
    //Menariknya, kita bisa juga menentukan proses penyaringan item yang sama seperti apa yang akan dijalankan dengan menggunakan fungsi distinctBy(). Misal kita ingin menyaring item yang memiliki panjang sama, kita bisa melakukannya seperti berikut:

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val lengthDistinct = text.distinctBy { it.length }
    println(lengthDistinct)
    println("==================")

    //Chunked() mirip seperti fungsi split(), namun split membutuhkan argumen berupa RegEx, sedangakan chunked membutuhkan nilai yang akan digunakan sebagai jumalah indeks untuk pemisah
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)
    println("==================")
    //chunked masih bisa dimanipulasi seperti mengubah nilai yang sudah dipecah menjadi hurugf kecil
    val chunkedTransform = word.chunked(3) {
        it.toString().lowercase()
    }
    println(chunkedTransform)
    //Argumen yang berada pada lambda expression di atas merepresentasikan setiap nilai yang sudah dipecah.


}