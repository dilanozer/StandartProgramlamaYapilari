package com.example.standartprogramlamayapilari

fun main() {

    var yas = 17
    var isim = "mehmet"

    // Ornek 1
    if (yas >= 18) {
        println("Reşitsiniz")
    }

    // Ornek 2 else
    if (yas >= 18) {
        println("Reşitsiniz")
    } else {
        println("Reşit değilsiniz")
    }

    // Ornek 3
    if (isim == "ahmet") {
        println("Merhaba ahmet")
    } else {
        println("Tanınmayan kişi")
    }

    // Ornek 4
    if (isim == "ahmet") {
        println("Merhaba ahmet")
    } else if (isim == "mehmet") {
        println("Merhaba mehmet")
    } else {
        println("Tanınmayan kişi")
    }

    // Ornek 5 çoklu şart and
    var kullaniciAdi = "adminx"
    var sifre = 12345

    if (sifre == 12345 && kullaniciAdi == "admin") {
        println("Hoşgeldiniz")
    } else {
        println("Hatalı giriş")
    }

    // Ornek 6 Çoklu şart or
    var sinif = 10

    if (sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12) {
        println("AYT sınavına hazırlanabilirsiniz")
    }

    // Ornek 7 kısaltma
    var a = 10
    var b = 14

    if (a == b) println("Eşit") else println("Eşit Değil")

}