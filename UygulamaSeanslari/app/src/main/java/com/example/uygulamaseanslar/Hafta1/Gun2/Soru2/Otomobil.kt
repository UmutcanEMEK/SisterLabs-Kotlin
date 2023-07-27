package com.example.uygulamaseanslar.Hafta1.Gun2.Soru2

class Otomobil (hiz:Int, yakitTüketimi:Int, var marka:String, var model:Int, var airbag:Boolean):Arac(hiz,yakitTüketimi) {

    fun otomobilBilgileri(){
        println("Otomobil marka: $marka")
        println("Otomobil model: $model")
        println("Otomobil hızı: $hiz")
        println("Otomobil yakıt tüketimi: $yakitTuketimi")

        if (airbag==true) {
            println("Otomobilde airbag mevcut.")
        }
    }
}