package com.example.odevler.Hafta2.Odev3

/*
Bir "Personel" adlı sınıf oluşturun ve şirketteki personellerin özelliklerini (ad, soyad, pozisyon, maaş vb.)
içeren nitelikleri ve "maasArttir" gibi işlevi ekleyin.
 */

class Personel(var ad:String,var soyad:String, var pozisyon:String, var maas:Int, var artanEnflasyon:Int, var yeniMaas:Int?) {

    fun maasArtir():Int{
        yeniMaas = (maas + maas * artanEnflasyon / 100)
        println("$ad $soyad isimli $pozisyon'nın $maas olan maaşı enflasyonun %$artanEnflasyon artmasından " +
                "dolayı $yeniMaas olacak şekilde artırılmıştır.")
        return 0
    }
}