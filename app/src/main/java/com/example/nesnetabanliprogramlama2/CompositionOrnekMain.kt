package com.example.nesnetabanliprogramlama2

fun main () {

    val k1 = KategorilerTablosu(1, "Dram")
    val k2 = KategorilerTablosu(1, "Komedi")

    val y1 = YonetmenlerTablosu(1, "Nuri Bilge Ceylan")
    val y2 = YonetmenlerTablosu(2, "Quentin Tarantino")

    val f1 = FilmlerTablosu(1, "Django", 2013, k1, y2)

    println("Film id: ${f1.film_id}")
    println("Filmin adı: ${f1.film_ad}")
    println("Filmin yılı: ${f1.film_yil}")
    println("Filmin kategorisi: ${f1.kategori.kategori_ad}")
    println("Filmin yönetmeni: ${f1.yonetmen.yonetmen_ad}")
}



