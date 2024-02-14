package com.dicoding.kotlin.oop.generics

/**
 * kotlin termasuk bahasa statically typed yang artinya ketika kita menambahkan variabel baru, scr otomatis variabel tsb akan dikenali pada saat kompilasi
 * scr umum generic adl konsep untuk menetukan tipe data yang akan digunakan, ditandai dengan tipe parameter, dan juga bisa mengganti tipe param menajadi tipe yang lebih spesifik dengan menentukan instance dari tipe tersebut
 */

//cara kerja generics pada tipe data List
val contributor = ListOf("Rama", "Adji", "Prasetyo")

//krn data list sudah memiliki data string, kita bisa menghapus tipe parameternya, namun jika kita ingin membuat variable tanpa memilik data kita wajib menentukan scr eksplisit tipe data yang akan digunakan untuk variable tsb

var contributor2 = ListOf<String>()

//bisa juga mendeklarasikan lebih dari 1 tipe parameter, nmisal menggunakan kelas Map yang memilik dua tipe yaitu value dan key

val points = mapOf<String, Int>()