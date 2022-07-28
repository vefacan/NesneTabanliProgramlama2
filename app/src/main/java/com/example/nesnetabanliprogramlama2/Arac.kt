package com.example.nesnetabanliprogramlama2

open class Arac(var renk:String,var vites:String) {

}

open class Araba(var kasaTipi:String,renk:String,vites:String):Arac(renk,vites){

}

class Nissan(renk:String,vites:String,kasaTipi:String,var model:String,):Araba(renk,vites,kasaTipi){

}

