package com.example.uygulamaseanslar.Hafta1.Gun1.Soru2

import java.util.Scanner

/*
Bir kullanıcının sınav notuna göre, eğer notu 70 ve üzeriyse "Geçtiniz", aksi halde "Kaldınız" mesajını veren
bir programı nasıl yazarsınız?
 */

fun main(args: Array<String>) {

    println("Notunuzu giriniz: ")
    var scanner = Scanner(System.`in`)
    var not = scanner.nextInt()



    if (not in 70..100){
        println("Tebrikler, geçtiniz!")
    if (not in 0..69)
        println("Kaldınız.")
    }else{
        println("Lütfen notunuzu doğru giriniz.")
    }

}