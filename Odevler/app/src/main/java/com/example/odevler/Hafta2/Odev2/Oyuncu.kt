package com.example.odevler.Hafta2.Odev2

/*
Bir "Oyuncu" adlı üst sınıf oluşturun. Ardından "Futbolcu" ve "Basketbolcu" adında iki alt sınıf oluşturun.
Her bir alt sınıfın kendine özgü özellikleri ve işlevleri olsun. Oyuncuların "oyna" işlevi olmalı.
 */

open class Oyuncu(var ad: String, var soyad:String, var numara:Int, var yas: Int, var spor: String) {

    open fun oyna() {}

}