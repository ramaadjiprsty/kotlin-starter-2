package com.dicoding.kotlin

//membuat kelas
class Animal(){
    var name: String = "Kucing"
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

//membuat objek dari kelas yang sudah dibuat
fun main() {
    val animal = Animal()
    println("Jenis Binatang: ${animal.name}, Berat: ${animal.weight}, Umur: ${animal.age}, Mamalia: ${animal.isMammal}")
    animal.eat()
    animal.sleep()

    //mengubah properti dari class animal
    animal.name = "Oyen"
    animal.weight = 2.5
    animal.age = 5
    println("Jenis Binatang: ${animal.name}, Berat: ${animal.weight}, Umur: ${animal.age}, Mamalia: ${animal.isMammal}")
    animal.eat()
    animal.sleep()

}

