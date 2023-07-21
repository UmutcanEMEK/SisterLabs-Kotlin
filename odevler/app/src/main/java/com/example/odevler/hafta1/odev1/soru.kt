package com.example.odevler.hafta1.odev1

import java.util.Scanner

fun main(args: Array<String>) {

    var kullaniciAdi = "Umutcan"
    var sifre = "EMEK"

    println("Kullanıcı adı giriniz: ")
    var girdi1 = Scanner(System.`in`)
    var girilenKullanıcıAdi = girdi1.nextLine()

    println("Şifre giriniz: ")
    var girdi2 = Scanner(System.`in`)
    var girilenSifre = girdi2.nextLine()

    if (girilenKullanıcıAdi.equals(kullaniciAdi, ignoreCase = true) && girilenSifre.equals(sifre, ignoreCase = false)){
        println("Hoş Geldiniz!")
    }
    else{
        println("Kullanıcı adı veya şifre hatalı!")
    }


}