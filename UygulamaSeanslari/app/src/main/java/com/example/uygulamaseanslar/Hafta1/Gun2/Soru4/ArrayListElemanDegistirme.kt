package com.example.uygulamaseanslar.Hafta1.Gun2.Soru4

import java.util.Scanner

/*
Bir String türünde ArrayList oluşturun ve içine "ahmet", "mehmet", "ayşe", "feyza", "emir" gibi isimleri ekleyin.
Kullanıcıdan alınan bir indeks numarasına göre listedeki ismi güncelleyen bir fonksiyon yazın. Yani kullanıcı,
"ahmet" isminin indeksini ve yeni ismi (örn. "ali") girerek listedeki "ahmet" ismini "ali" olarak değiştirebilsin.
 */

fun main() {

    var isimler: Array<String> = arrayOf("Ahmet","Mehmet","Ayşe","Feyza","Emir")

    println("Değiştirmek istediğiniz indeks numarasını giriniz: ")
    var scanner = Scanner(System.`in`)
    var indeks = scanner.nextInt()

    println("Yeni ismi giriniz: ")
    var scanner2 = Scanner(System.`in`)
    var yeniIsim = scanner2.nextLine()

    isimler[indeks] = yeniIsim

    println("Güncel isimler listesi: ${isimler.joinToString()}")

}