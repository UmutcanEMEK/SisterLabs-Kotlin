package com.example.uygulamaseanslari

class Dikdortgen (var uzunluk: Double, var genislik: Double) {
    fun alan(): Double {
        return  genislik * uzunluk
    }
    fun cevre(): Double {
        return 2 *(uzunluk + genislik)
    }



}