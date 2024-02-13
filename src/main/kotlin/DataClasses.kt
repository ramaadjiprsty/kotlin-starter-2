package com.dicoding.kotlin

class user(val name: String, val age: Int) {
    override fun toString(): String {
        return "User (name = $name, age = $age)"
    }
}
data class dataUser(val name: String, val age: Int)

fun main() {
    val user = user("Rama", 20)
    val dataUser = dataUser("Rama", 20)

//    val age = dataUser.component2()
    val (name, age) = dataUser
    print("$name $age")
}