package com.example.odevler.Hafta2.Odev1

class Daire (var yariCap:Double, var pi:Double):GeometrikSekil(){

    override fun alan():Double{
        return pi * yariCap * yariCap
    }

    override fun cevre():Double{
        return 2 * pi * yariCap
    }
}