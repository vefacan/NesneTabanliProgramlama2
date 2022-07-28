package com.example.nesnetabanliprogramlama2

fun main() {

    val dolmabahce = Saray(286, 8)

    println("Dolmabahçe Sarayı pencere sayısı:${dolmabahce.pencereSayisi}")
    println("Dolmabahçe Sarayı kule sayısı: ${dolmabahce.kuleSayisi}")

    val yazlik = Villa(20, true)

    println("Yazlık villanın pencere sayısı: ${yazlik.pencereSayisi}")
    println("Yazlık villanın garajı var mı?: ${yazlik.garajVarMi}")

    if (dolmabahce is Saray){
        println("Saraydır.")
    }
    else {
        println("Değildir.")
    }

}