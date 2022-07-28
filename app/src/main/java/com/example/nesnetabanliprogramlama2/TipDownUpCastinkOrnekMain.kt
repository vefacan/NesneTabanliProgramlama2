package com.example.nesnetabanliprogramlama2


fun main(){

    val ogretmen:Personel = Ogretmen()
    val isci:Personel = Isci()

    val mudur = Mudur()

    mudur.iseAl(ogretmen)
    mudur.iseAl(isci)

    mudur.terfiAl(ogretmen)
    mudur.terfiAl(isci)
}