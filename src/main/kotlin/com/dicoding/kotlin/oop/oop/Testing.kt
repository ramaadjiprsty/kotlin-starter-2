package com.dicoding.kotlin

class MyLibrary {
    fun totalBook(pinjam: Int, stock: Int = 100): Int {
        println("Total book in $LIBRARY_NAME is unlimited")
        println("Jumlah buku yang di pinjam sebanyak $pinjam pcs")
        val total = stock-pinjam
        print("Total Buku yang tersedia adalah $total pcs")
        return total
    }

    companion object {
        const val LIBRARY_NAME = "Dicoding Library"
    }
}

fun main() {
//    val name = MyLibrary.LIBRARY_NAME
//    val perpus = MyLibrary()
//    perpus.totalBook(49)

//    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
////mutableSet[2] = 6 // tidak bisa mengubah mutableSet
//    mutableSet.add(6) // menambah item di akhir set
//    mutableSet.remove(2)//menghapus item yang memiliki nilai 1
//    println(mutableSet)

    val anyList = mutableListOf("Genshin", "Honkai", "TFT")
    val game = anyList[0]
//    println("Biasanya saya bermain ${anyList[1]} tiap malam")

    //filter dan filterNot berfungsi memfilter isi dari sebah kumpulan data
    //keyword it merepresentasikan masing2 item pada numberlist
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter{it % 2 == 0}
    val notEvenList = numberList.filterNot{it % 2 == 0}
    println(evenList)
    println(notEvenList)

    //map() akan membuat collection baru dari collection yang sudah adda sesuai perubahan yang akan kita lakukan
    val multipledBy5 = numberList.map { it * 5 }
    println(multipledBy5)

    //count() berguna untuk menambahkan sebuah parameter yang berisi sebuah kondsi, misal menampilkan jumlah item pada numberLst yang merupakan kelipatan dari 3
    println(numberList.count { it % 3 == 0 })

    //find() adl fungsi yang digunakan untuk mencari item pertama sesuai dengan kondisi yang ditentukan, misal menccari angka ganjl pertama dari numberList
    val firstOddNumber = numberList.find { it % 2 == 1 } // output 1
    //firsfOffNull() mirip seperti find() namun jika collection tidak ditemukan data yang sesuai maka akan mengembalikan niiai null
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    //first() dan last() fungsi mennyaring item pertama atau terakhir di collection, kta juga bisa menambahkan sebauh kondisi dengan parameter, namun harus dperhatikan apabila kondisi tidak terpenuhi maka hasilnya akan exception
//    val moreThan10 = numberList.first { it > 10 }

    //sum() untuk menjumlahkan setiap data yang ada pada collection
    println(numberList.sum())

    //sorted() digunakan untuk mengurutkan tem yang ada pada collcetion, scr default akan mengurutkan secara asacending
    val kotlinChar = listOf("k", "o", "t", "l", "i", "n")
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    //untuk sorting scr descending kita bs menggunakan sortedDescending()
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}