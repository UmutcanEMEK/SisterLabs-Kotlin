package com.example.uygulamaseanslari.Hafta1.Gun1.Soru4

import java.util.Scanner

//Kullanıcıdan bir ay ismi girmesini isteyen ve bu aya göre mevsim bilgisini ekrana yazdıran bir programı nasıl yazarsınız?

fun main(args: Array<String>) {

    println("Bir ay giriniz: ")
    var scanner = Scanner(System.`in`)
    var girilenAy = scanner.nextLine()

    var kisAyları : Array<String> = arrayOf("Aralık","Ocak","Şubat")
    var ilkBaharAyları : Array<String> = arrayOf("Mart","Nisan","Mayıs")
    var yazAyları : Array<String> = arrayOf("Haziran","Temmuz","Ağustos")
    var sonBaharAyları : Array<String> = arrayOf("Eylül","Ekim","Kasım")


    when(girilenAy){
        "aralık","ocak","şubat"  -> println("Girdiğniz ay kış mevsimine ait.")
        "mart","nisan","mayıs" -> println("Girdiğniz ay ilkbahar mevsimine ait.")
        "haziran","temmuz","ağustos" -> println("Girdiğniz ay yaz mevsimine ait.")
        "eeylül","ekim","kasım" -> println("Girdiğniz ay son bahar mevsimine ait.")
        else -> println("Lütfen tüm harfleri küçük ve doğru giriniz.")
    }
}