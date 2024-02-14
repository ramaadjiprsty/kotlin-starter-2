package com.dicoding.kotlin

/**
 * Kotlin memiliki mekanisme untuk menunda proses inisialisasi sampai variabel tersebut benar-benar dibutuhkan, yakni dengan menggunakan lateinit dan lazy
 * Lateinit merupakan keyword yang ditambahkan sebelum variabel untuk membuat proses inisialisasi bisa ditunda. Berikut ini contohnya.
 */

//lateinit var name: String
//fun main() {
//    name = "Dicoding Miaw"
//    print(name.length)
//}

//Hal yang perlu diperhatikan adalah lateinit harus disandingkan dengan keyword var (tidak bisa menggunakan val). Hal ini berbeda dengan Lazy property yang nanti akan dibahas.

//Kita juga dapat memeriksa apakah variabel tersebut sudah diinisialisasi dengan menggunakan fungsi isInitialized seperti ini.

//lateinit var name: String
//fun main() {
//    name = "Dicoding Miaw"
//    if (::name.isInitialized)
//        print(name.length)
//    else
//        print("Not Initialized")
//}

//Jika mencoba untuk mengakses variabel yang belum terinisialisasi, Anda akan mendapat error “Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property name has not been initialized”.

/**
 * LAZY PROPERTY
 * Selain menggunakan keyword lateinit, kita juga bisa menggunakan lazy property untuk membuat property yang bukan null dan menunda inisialisasi. Berikut ini contoh kodenya.
 * Dalam menggunakan lazy property, Anda harus menggunakan keyword val. Hal ini karena nilainya hanya dapat diinisialisasi satu kali.
 */

val name: String by lazy {
    "Dicoding Miaw"
}
fun main() {
    print(name.length)
}

