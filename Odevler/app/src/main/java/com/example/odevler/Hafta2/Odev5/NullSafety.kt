package com.example.odevler.Hafta2.Odev5

/*
Medium yazıma bu linkten ulaşabilirsiniz:
https://umutcanemek.medium.com/kotlin-null-safety-93238f05854c
 */

fun main(args: Array<String>) {

    var eMail: String = "umutcanemek23@outlook.com"
    /*
    Bu haliyle değişkenimizi null bırakamayız, bu değişken tipimiz
    "Non-Nullable" yani null olamaz tipindedir.
    */

    var phoneNumber: Int? = null
    /*
    Değişkenimizi bu şekilde tanımladğımızde ise değişkenimize null
    olabilme ihtimalini veriyoruz, bu değişken tipimiz
    "Nullable" yani null olabilir tiptedir.
    */

    println("$eMail $phoneNumber")

    if (phoneNumber != null) {
        println("Telefon numarası: $phoneNumber")
        //Telefon numarası eğer null değilse telefon numarasını yazdırır.
    } else {
        println("Telefon numarası bulunamadı.")
        //Eğer telefon numarası değeri "null" ise istediğimiz metni yazdırır.
    }

    /*var adres:String? = null
    println(adres?.length)
    //safe call (?.) operatörü bu şekilde kullanılır.
*/
    var adres: String? = null
    adres?.let { println(it.length) }
    //safe call (?.) operatörü ile birlikte "let" kullanımı.


    var telefonNo:Any? = phoneNumber ?: "Telefon numarası bulunamadı."
    println(telefonNo)
    //Telefon numarası "null" değilse telefon numarasını, "null" ise girdiğimiz mesajı yazdırır.

    /*var telefonNO: Any? = if (phoneNumber != null) phoneNumber else "Telefon numarası bulunamadı."
    println(telefonNO)
    */
    //Telefon numarası "null" değilse telefon numarasını, "null" ise girdiğimiz mesajı yazdırır.

}
