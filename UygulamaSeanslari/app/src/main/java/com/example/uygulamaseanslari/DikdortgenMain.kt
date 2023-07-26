package com.example.uygulamaseanslari

fun main() {
    val dikdortgen = Dikdortgen(8.0, 3.0)
    val cevreDikdortgen = dikdortgen.cevre()
    val alanDikdortgen = dikdortgen.alan()


    println("alan: $alanDikdortgen")
    println("cevre: $cevreDikdortgen")
}