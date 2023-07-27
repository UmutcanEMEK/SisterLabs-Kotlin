package com.example.uygulamaseanslari

/*
Bir "Dikdörtgen" adlı sınıf oluşturun ve uzunluk ve genişlik gibi özellikleri içeren özellikleri tanımlayın.
Ardından, bu sınıftan bir dikdörtgen nesnesi oluşturun ve dikdörtgenin alanını ve çevresini hesaplayan bir fonksiyon yazın.
 */
class Dikdortgen (var uzunluk: Double, var genislik: Double) {
    fun alan(): Double {
        return  genislik * uzunluk
    }
    fun cevre(): Double {
        return (uzunluk + genislik)
    }

}