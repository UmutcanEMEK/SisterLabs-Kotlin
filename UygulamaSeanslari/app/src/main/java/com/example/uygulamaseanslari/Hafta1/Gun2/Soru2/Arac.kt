package com.example.uygulamaseanslar.Hafta1.Gun2.Soru2

/*
"Arac" adlı bir üst sınıf oluşturun ve bu sınıfta araçların hızı ve yakıt tüketimi gibi özellikleri tanımlayın.
Ardından "Otomobil" adlı bir alt sınıf oluşturun ve bu sınıfta otomobil türüne özgü özellikleri ekleyin.
"Otomobil" sınıfı "Arac" sınıfından kalıtım almalıdır. Otomobil sınıfında "bagajHacmi" adlı bir özelliği ve
"bagajAc" adlı bir metodu ekleyin.
 */

open class Arac(var hiz:Int, var yakitTuketimi: Int) {

        fun aracBilgileri(){
        println("Araç hızı: $hiz")
        println("Araç yakıt tüketimi: $yakitTuketimi")
    }
}