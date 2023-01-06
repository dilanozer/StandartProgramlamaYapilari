package com.example.standartprogramlamayapilari

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    val isimler = Array<String>(5){""} // 5 eleman alinacagi belirtme

    for (i in 0 until isimler.count()) { // 0, 1, 2, 3, 4

        println("${i+1}. isim giriniz")
        val isim = girdi.next()
        isimler[i] = isim

    }

    for ((index, isim) in isimler.withIndex()) {
        println("${index+1}. isim: ${isim}")
    }

}