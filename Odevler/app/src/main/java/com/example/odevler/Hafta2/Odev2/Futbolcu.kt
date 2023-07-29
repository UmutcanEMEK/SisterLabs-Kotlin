package com.example.odevler.Hafta2.Odev2


class Futbolcu(ad: String, soyad:String, numara:Int, yas: Int, var mevki: String) : Oyuncu(ad, soyad ,numara, yas,"futbol") {

    override fun oyna() {
        println("$ad $soyad adlı $numara numaralı $yas yaşındaki oyuncu $mevki mevkisinde $spor oynuyor.")
    }
}