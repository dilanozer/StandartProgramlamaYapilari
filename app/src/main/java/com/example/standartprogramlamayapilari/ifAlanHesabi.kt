package com.example.standartprogramlamayapilari

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    println("Dikdortgen Alanı (1)")
    println("Çember Alanı (2)")

    val secim = girdi.nextInt()

    println("Seçiminiz: $secim")

    if (secim == 1) {
        println("Kısa kenar giriniz")
        val kisiKenar = girdi.nextInt()

        println("Uzun kenar giriniz")
        val uzunKenar = girdi.nextInt()

        println("Dikdortgen Alanı")
        val dikdortgenAlani = kisiKenar*uzunKenar

        println("Sonuç: $dikdortgenAlani")
    }

    if (secim == 2) {
        println("Yarıçap giriniz")
        val yariCap = girdi.nextInt()

        println("Çember Alanı")
        val cemberAlani = 3.14*yariCap*yariCap
        println("Sonuç: $cemberAlani")

    }

}