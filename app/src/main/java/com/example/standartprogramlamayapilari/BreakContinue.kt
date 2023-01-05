package com.example.standartprogramlamayapilari

fun main() {

    for (i in 1..5) {

        if (i == 3) {
            break // donguyu bitir
        }

        println("Döngü 1: $i")
    }

    for (i in 1..5) {

        if (i == 3) {
            continue // pas geç
        }

        println("Döngü 2: $i")
    }

}