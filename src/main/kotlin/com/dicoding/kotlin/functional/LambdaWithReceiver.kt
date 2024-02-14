package com.dicoding.kotlin.functional

/*
    Pada dasarnya sebuah lambda yang mempunyai receiver mirip seperti extension functions, yang memungkinkan kita untuk mengakses anggota objek receiver dari dalam extension. Pada lambda, receiver ditentukan pada saat menentukan tipe deklarasi. Contohnya perhatikan kode yang tidak menggunakan DSL di bawah ini:
 */

fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

/*
    Kode di atas merupakan contoh kode StringBuilder yang digunakan untuk menambahkan kata satu per satu. Jika dilihat kode ini cukup panjang tidak fleksibel. Jika Anda ingin membuat menambahkan kata baru harus di dalam kode tersebut dan mengulang-ulang kata stringBuilder. Dengan menggunakan DSL, Anda dapat menyingkat kode tersebut dan cukup fokus pada fungsi append-nya saja. Berikut adalah contoh membuat Lambda with Receiver:
 */

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

/*
    Pada kode di atas, StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action. Dengan begitu kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder. Untuk memanggil fungsi di atas bisa seperti berikut:
 */

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}