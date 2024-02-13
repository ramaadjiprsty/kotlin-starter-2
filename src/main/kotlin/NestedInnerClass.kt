package com.dicoding.kotlin

class House {
    //properti outer class
    val buildingArea = 100
    //inner digunakan agar member class bisa mengakses properti milik outer class
    inner class room {
        val totalRooms = 4
        fun measureRoomArea () {
            //contoh akses yang bisa digunakan oleh inner class
            println(buildingArea/totalRooms)
        }
    }
}

//untuk mengakses fungsi didalam inner, perlu menginisialisasi outer dulu

//CONTOH 2
//apabila outer dan inner class memiliki nama properti yang sama, defaultnya kotlin akan mengambil properti dari inner, jika ingin mengambil properti dari outer dengan nama yang sama bisa menggunakan qualified this

class House2 {
    //properti outer class
    val buildingArea = 100
    val totalRooms = 5
    //inner digunakan agar member class bisa mengakses properti milik outer class
    inner class Room {
        val totalRooms = 4
        fun measureRoomArea () {
            //memanggil properti milik outer class
            println(buildingArea/this@House2.totalRooms)
        }
    }
}


fun main() {
    val house = House2()
    val room = house.Room()
    room.measureRoomArea()
}