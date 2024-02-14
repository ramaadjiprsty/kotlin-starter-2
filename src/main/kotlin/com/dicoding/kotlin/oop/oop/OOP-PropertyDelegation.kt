package com.dicoding.kotlin

/**
 * Pengelolaan properti kelas baik itu memberikan atau merubah sebuah nilai dapat didelegasikan kepada kelas lain. Dengan ini kita dapat meminimalisir boilerplate dalam penulisan getter dan setter (jika properties menggunakan var) pada setiap kelas yang kita buat. Sebagai contoh, kita memiliki tiga buah kelas yang di dalamnya memiliki satu properti String. Jika kita ingin menerapkan getter dan setter pada setiap properti kelasnya, maka kita perlu menuliskan getter dan setter tersebut pada seluruh kelas. Hal tersebut dapat mengurangi efisiensi dalam menuliskan kode karena terlalu banyak kode yang harus kita tulis secara berulang. Solusinya, kita perlu membuat sebuah kelas yang memang bertugas untuk mengatur atau mengelola fungsi getter dan setter untuk sebuah properti kelas. Teknik tersebut pada Kotlin dinamakan Delegate.
 *
 * Sebelum mendelegasikan sebuah properti kita perlu membuat kelas delegasi terlebih dahulu. Mari kita buat sebuah kelas delegasi
 */

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

/**
 * Kemudian untuk mendelegasikan sebuah properti kelas, kita gunakan keyword by dalam menginisialisasi properti tersebut kemudian diikuti dengan namanya. Perhatikan kode berikut:
 * Dengan begitu nilai properti name dikelola melalui kelas DelegateName. Kita dapat mendelegasikan banyak properti yang terdapat pada banyak kelas kepada satu kelas Delegate saja. Perhatikan kode berikut untuk untuk lebih jelasnya:
 */

class Binatang {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

/**
 * Mari kita membuat sebuah objek, ubah dan akses nilai propertinya pada setiap kelas, kemudian jalankan. Maka hasilnya akan seperti pada kode berikut:
 */

fun main() {
    val animal = Binatang()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")

    val binatang2 = Binatang2()
    binatang2.name = "Dicoding cat"
    binatang2.weight = 6.2
    binatang2.age = 1

    println("Nama: ${binatang2.name}")
    println("Berat: ${binatang2.weight}")
    println("Umur: ${binatang2.age} Tahun")
}

/*
output:
    Fungsi ini sama seperti setter untuk properti name pada class Animal@17f052a3
    Nilai name dari: Default akan berubah menjadi Dicoding Miaw
    Fungsi ini sama seperti getter untuk properti name pada class Animal@17f052a3
    Nama Hewan: Dicoding Miaw
    Fungsi ini sama seperti setter untuk properti name pada class Person@2e0fa5d3
    Nilai name dari: Default akan berubah menjadi Dimas
    Fungsi ini sama seperti getter untuk properti name pada class Person@2e0fa5d3
    Nama Orang: Dimas
    Fungsi ini sama seperti setter untuk properti name pada class Hero@5010be6
    Nilai name dari: Default akan berubah menjadi Gatotkaca
    Fungsi ini sama seperti getter untuk properti name pada class Hero@5010be6
    Nama Pahlawan: Gatotkaca
*/

/**
 * Pada contoh di atas, delegasi hanya dapat digunakan oleh properti yang memiliki tipe data String. Namun kita juga dapat membuat sebuah delegasi kelas umum yang dapat digunakan oleh seluruh tipe data dengan memanfaatkan tipe data Any.
 */

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Binatang2 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}