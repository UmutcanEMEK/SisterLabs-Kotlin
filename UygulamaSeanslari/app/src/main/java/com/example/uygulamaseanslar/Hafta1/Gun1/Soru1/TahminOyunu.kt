package com.example.uygulamaseanslar.Hafta1.Gun1.Soru1

import java.util.Scanner

//Kullanıcıya belirli bir sayı kadar tahmin yapma hakkı veren bir sayı tahmin oyununu nasıl oluşturursunuz?

fun main(args: Array<String>) {

    println("3 tahmin hakkınız var.")
    println("Sayı giriniz: ")

    var dogruSayi = 9
    var i = 1
    while (i<=3){
        var scanner = Scanner(System.`in`)
        var tahmin = scanner.nextInt()
        i++
        if (tahmin==dogruSayi){
            println("Bingo! TEBRİKLER.")
            break
        }else{
            println("Yanlış Tahmin.")
        }


    }


}
