package com.example.odevler.hafta1.odev2

import java.util.Scanner

fun main(args: Array<String>) {

    try {
        println("Lütfen Yaşınızı Giriniz: ")
        var girdi1 = Scanner(System.`in`)
        var girilenYas = girdi1.nextInt()

        if (girilenYas<0 || girilenYas>122){
            println("Lütfen geçerli bir yaş giriniz.")
        }else if (girilenYas>=18){
            println("Tebrikler, oy kullanabilirsiniz!")
        }else
            println("Maalesef oy kullanacak yaşta değilsiniz.")
    }
    catch (e:Exception){
        println("Bu alana sadece sayı girilebilir.")
    }


}