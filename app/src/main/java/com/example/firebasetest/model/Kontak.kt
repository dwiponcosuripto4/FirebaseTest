package com.example.firebasetest.model

data class Kontak(
    val id: String,
    val nama: String,
    val alamat: String,
    val telepon: String,
){
    constructor(): this("","","","")
}
