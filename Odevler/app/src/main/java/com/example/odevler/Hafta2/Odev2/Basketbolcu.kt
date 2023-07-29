package com.example.odevler.Hafta2.Odev2


class Basketbolcu(ad: String, soyad:String, numara:Int, yas: Int, var mevki: String) : Oyuncu(ad, soyad,numara, yas, "basketbol") {

    override fun oyna() {
        println("$ad $soyad adlı $numara numaralı $yas yaşındaki oyuncu $mevki pozisyonunda $spor oynuyor.")
    }
}