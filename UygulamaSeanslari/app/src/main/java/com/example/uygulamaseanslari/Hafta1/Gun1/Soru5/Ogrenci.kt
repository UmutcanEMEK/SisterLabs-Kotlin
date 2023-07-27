package com.example.uygulamaseanslari.Hafta1.Gun1.Soru5

/*
Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri içeren özellikleri tanımlayın.
Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve bu öğrencilerin özelliklerini ekrana yazdıran bir fonksiyon yazın
 */

class Ogrenci(var adi: String, var soyadi: String, var sinifi: Int) {

    fun ogrenciBilgileri(){
        println("Öğrencinin adı: $adi")
        println("Öğrencinin Soyadı: $soyadi")
        println("Öğrencinin Sınıfı: $sinifi")
    }
}