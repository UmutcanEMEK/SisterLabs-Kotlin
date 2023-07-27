package com.example.uygulamaseanslar.Hafta1.Gun2.Soru3

import java.io.SyncFailedException
import java.util.ArrayList
import java.util.Scanner

/*
Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin.
Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın
 */

fun main(args: Array<String>) {

    var sayilar = ArrayList<Int>()
    println("5 adet sayı giriniz: ")

    var i = 1
    while (i in 1..5){
        println("$i.sayi: ")
        var scanner = Scanner(System.`in`)
        var sayi = scanner.nextInt()
        sayilar.add(sayi)
        i++
    }
    println("Sayılar: ${sayilar.joinToString()}")

    var sayilarinToplamı = toplama(sayilar)
    println("Sayı dizisinin toplamı: $sayilarinToplamı")
}


fun toplama(sayilar:ArrayList<Int>):Int{
    var toplam = 0
    for (i in sayilar){
        toplam = toplam + i
    }
    return toplam
}