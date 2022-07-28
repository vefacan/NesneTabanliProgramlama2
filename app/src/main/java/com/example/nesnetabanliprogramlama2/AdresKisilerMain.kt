package com.example.nesnetabanliprogramlama2

fun main (){

    val adres = Adres("İzmir","Gaziemir")

    val kisiler = Kisiler1 ("Vefa",25, adres)

    println("Kişinin adı: ${kisiler.isim}")
    println("Kişinin yaşı: ${kisiler.yas}")
    println("Kişinin ili: ${kisiler.adres.il}")
    println("Kişinin ilçesi ${kisiler.adres.ilce}")

}