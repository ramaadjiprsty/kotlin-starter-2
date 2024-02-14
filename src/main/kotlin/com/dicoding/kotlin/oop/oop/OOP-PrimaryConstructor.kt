package com.dicoding.kotlin

/**
 * Seperti namanya, jika akan membuat suatu objek dari sebuah kelas dan kelas tersebut memiliki primary constructor di dalamnya, kita harus mengirim nilai sesuai properti yang dibutuhkan. Penulisan primary constructor mirip seperti parameter pada fungsi. Properti cukup dituliskan pada header class diawali dengan var atau val. Perhatikan kode berikut.
 */

class Animal4(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)

/**
 * Pada baris kode tersebut, kita tidak hanya membuat sebuah kelas, tetapi sekaligus menambahkan sebuah primary constructor pada kelas tersebut. Sekarang mari kita coba membuat objek dari kelas tersebut.
 */

fun main(){
    val dicodingCat = Animal4("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}

/*
output:
    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
*/

/**
 * INIT BLOCK
 * Kotlin menyediakan blok init yang memungkinkan kita untuk menuliskan properti di dalam body class ketika kita menggunakan primary constructor. Memang, memiliki kode banyak di dalam body class bukanlah hal yang baik. Kotlin bertujuan agar kita dapat menuliskan kode seminimal mungkin. Tapi blok init di sini memiliki beberapa fungsi selain menginisialisasi properti kelas.  satu fungsi lainnya adalah untuk membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi. Pada kelas Animal contohnya, kita dapat melakukan verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari nol.
 *
 * Untuk membuatnya, kita dapat menggunakan keyword init kemudian inisialisasikan semua properti di dalam blok tersebut dengan parameter kelas.
 */

class Animal5(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    //validasi constructor tidak boleh dibawah 0, jika terjadi nilai pada else akan digunakan
    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

/**
 * Perhatikan juga penamaan antara properti pada body class dan parameter pada head class penamaan antara keduanya harus berbeda agar tidak terjadi ambiguitas. Lantas bagaimana jika kita ingin penamaan keduanya sama? Untuk menghindari ambiguitas kita dapat menggunakan keyword this dalam menginisialisasi properti tersebut dalam blok init.
 *
 *
 */

//class Animal(name: String, weight: Double, age: Int, isMammal: Boolean) {
//    val name: String
//    val weight: Double
//    val age: Int
//    val isMammal: Boolean
//
//    init {
//        this.weight = if(weight < 0) 0.1 else weight
//        this.age = if(age < 0) 0  else age
//        this.name = name
//        this.isMammal = isMammal
//    }
//}

/**
 * Kata kunci this tersebut merujuk kepada suatu kelas. Maksudnya adalah ketika menggunakan kelas tersebut dan diikuti dengan nama properti, berarti kita menunjuk pada properti yang terdapat pada kelas. Dengan begitu, tidak akan ada ambiguitas walaupun kita menggunakan penamaan yang sama antara properti dan parameter primary constructor.
 */