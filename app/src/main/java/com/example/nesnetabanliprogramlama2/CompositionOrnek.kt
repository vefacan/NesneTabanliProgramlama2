package com.example.nesnetabanliprogramlama2

class KategorilerTablosu(var kategori_id:Int,var kategori_ad:String) {
}


class YonetmenlerTablosu (var yonetmen_id:Int,var yonetmen_ad:String){
}

class FilmlerTablosu(var film_id:Int,
                     var film_ad:String,
                     var film_yil:Int,
                     var kategori:KategorilerTablosu,
                     var yonetmen:YonetmenlerTablosu){
}