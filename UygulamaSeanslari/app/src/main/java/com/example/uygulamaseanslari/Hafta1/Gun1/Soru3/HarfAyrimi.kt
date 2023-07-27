package com.example.uygulamaseanslar.Hafta1.Gun1.Soru3

import java.util.Scanner

/*
Kullanıcıdan bir harf girmesini isteyen ve bu harfin sesli veya sessiz harf olduğunu ekrana yazdıran bir programı nasıl yazarsınız?
 */

fun main() {

    println("Bir harf giriniz: ")
    var scanner = Scanner(System.`in`)
    var harf = scanner.nextLine().first()
    var sesliHarfler: CharArray = charArrayOf('a','e','ı','i','o','ö','u','ü')

    if (harf in sesliHarfler){
        println("Girdiğiniz harf bir sesli harftir.")
    }else{
        println("Girdiğiniz harf bir sessize harftir.")
    }
}