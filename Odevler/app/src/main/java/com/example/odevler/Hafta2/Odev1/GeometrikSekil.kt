package com.example.odevler.Hafta2.Odev1

/*
Bir "GeometrikSekil" adlı üst sınıf oluşturun. Ardından "Dikdortgen" ve "Daire" adında iki alt sınıf oluşturun.
Her alt sınıfın kendine özgü alan ve çevre hesaplayan işlevleri olsun. (Dikdörtgen alan = uzunluk x genişlik,
çevre = 2 x (uzunluk + genişlik), Daire alan = π x yarıçap x yarıçap, çevre = 2 x π x yarıçap)
Not: ortak kullanılanlar GeometrikSeklin özelliği olacak
 */

open class GeometrikSekil {

    open fun alan():Double{
        return 0.0
    }
    open fun cevre():Double{
        return 0.0
    }

}