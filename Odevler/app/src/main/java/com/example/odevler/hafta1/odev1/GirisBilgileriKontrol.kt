package com.example.odevler.hafta1.odev1

import java.util.Scanner

/*
Dışardan kullanıcı adı ve şifre girişi alınacak, girilen bu kullanıcı adı ve şifre önceden belirlenen kullanıcı
adı ve şifreyle  eşleştirilecek . Kullanıcı adında büyük-küçük harf farkı göz ardı edilecek, ancak şifrede
büyük-küçük harf farkı olması gerekmektedir. kullanıcı adı ve şifre daha önce belirlenen kullanıcı adı ve şifreyle
uyuşuyorsa hoş geldiniz diyecek eşleşmiyorsa kullanıcı adı veya şifre hatalı uyarı verecek program yazılmalı
 */

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