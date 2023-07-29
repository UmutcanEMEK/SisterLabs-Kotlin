package com.example.odevler.Hafta2.Odev4

/*
Bir "Kullanici" adlı sınıf oluşturun ve ad ve soyad gibi özellikleri içeren nullable özellikler tanımlayın.
Kullanıcı adı ve soyadı null olabileceğini göz önünde bulundurarak bu özelliklere nasıl erişebilirsiniz?
 */

class Kullanıcı(var ad:String?, var soyad:String?) {

    fun yazdir(): String {
        if (ad != null && soyad != null) {
            println("$ad $soyad")
        } else if (ad == null && soyad == null) {
            println("Kullanıcı bulunamadı.")
        } else if (ad == null) {
            println(soyad)
        } else {
            println(ad)
        }
        return "$ad $soyad"
    }

}