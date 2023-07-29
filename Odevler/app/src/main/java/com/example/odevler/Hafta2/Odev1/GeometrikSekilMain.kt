package com.example.odevler.Hafta2.Odev1

fun main(args: Array<String>) {

    var dikdortgen = Dikdortgen(10.0,5.0)
    println("Dikdörtgenin alanı: ${dikdortgen.alan()}")
    println("Dikdörtgenin çevresi: ${dikdortgen.cevre()}\n")

    var daire = Daire(5.0,3.14)
    println("Dairenin alanı: ${daire.alan()}")
    println("Dairenin çevresi: ${daire.cevre().toFloat()}")

}