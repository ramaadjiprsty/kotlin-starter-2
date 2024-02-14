package com.dicoding.kotlin

/**
 * PROPERTY ACCESSOR
 * ketika properti dibuat mutable, maka kotlin akan menghasilakn fungsi getter dan setter padaa properti tersebut
 * jika properti pada sebuah kelas dibuat read-only/val, kotlin hanya akan membuat fungsi getter pada properti tersebut
 * namun anda bisa membuat fungsi getter dan setter secara manual jika pada kasus tertenut ada perlu untuk override fungsi tersbebut
 */

class Animal2{
    var name: String = "Dicoding Miaw"
}

fun main(){
    val dicodingCat = Animal3()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}

/*
    output:
    Nama: Dicoding Miaw
    Nama: Goose
*/

/*
Pada kode  ${dicodingCat.name} sebenarnya terjadi proses pemanggilan fungsi getter pada properti name. Namun kita tidak melakukan override pada fungsi getter  sehingga fungsi tersebut hanya mengembalikan nilai name saja. Begitu juga pada kode dicodingCat.name = "Goose" pada kode tersebut terjadi pemanggilan fungsi setter pada properti name.

Tetapi jika kita melakukan override pada fungsi getter dan juga setter , maka kita dapat menambahkan kode lain pada fungsi getter sesuai dengan kebutuhan. Mari kita coba modifikasi kode sebelumnya menjadi:
 */

class Animal3{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

/*
Urutan pendefinisian fungsi get() dan set() tidaklah penting, kita dapat mendefinisikan fungsi get() tanpa mendefinisikan fungsi set() dan juga sebaliknya. Yang terpenting pendeklarasiannya dilakukan setelah mendeklarasikan properti tersebut. Pada fungsi get(), kita perlu mengembalikan nilai sesuai tipe data dari propertinya atau kita dapat mengembalikan nilai dari properti itu sendiri dengan menggunakan keyword field. Sedangkan untuk fungsi set() kita memerlukan sebuah parameter. Ini merupakan sebuah nilai baru yang nantinya akan dijadikan nilai properti. Pada kode di atas parameter tersebut ditetapkan dengan nama value.
 */