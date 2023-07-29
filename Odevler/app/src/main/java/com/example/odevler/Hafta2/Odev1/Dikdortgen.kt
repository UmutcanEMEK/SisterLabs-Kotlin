package com.example.odevler.Hafta2.Odev1

class Dikdortgen(var genislik:Double, var uzunluk:Double):GeometrikSekil() {

    override fun alan():Double{
        return genislik * uzunluk
    }

    override fun cevre():Double{
         return 2 * (genislik + uzunluk)
    }
}