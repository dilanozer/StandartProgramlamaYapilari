package com.example.standartprogramlamayapilari

import kotlin.math.*
import kotlin.random.Random

fun main() {

    for (i in 1..10) {
        val rastgeleSayi = Random.nextInt(0, 10) // 0 ile 9 arasinda random sayilar
        println(rastgeleSayi)
    }

    val c = ceil(6.5) // yukari yuvarlama
    println("c: $c")

    val f = floor(6.5) // asagi yuvarlama
    println("f: $f")

    val s = sqrt(4.0) // karekok alma
    println("s: $s")

    val a = abs(-10) // mutlak deger
    println("a: $a")

    val mx = max(100, 200) // 200
    println("max: $mx")

    val mn = min(100, 200) // 100
    println("min: $mn")

    val p = 2.0.pow(3.0) // 8
    println("p: $p")

}