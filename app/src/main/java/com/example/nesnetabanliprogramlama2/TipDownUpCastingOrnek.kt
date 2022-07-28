package com.example.nesnetabanliprogramlama2

open class Personel() {
    fun iseAlindi(){
        println("Personel mutlu.")
    }
}

class Mudur:Personel(){
    fun iseAl(p:Personel){
        p.iseAlindi()

    }
    fun terfiAl(p:Personel){

        if (p is Ogretmen){

            p.maasArttir()


        }
        if (p is Isci){

            println("İşçiler terfi alamaz.. :(")

        }

    }

}

class Isci:Personel(){

}

class Ogretmen:Personel(){

    fun maasArttir(){

        println("Maaş arttı. Öğretmen mutlu. :)")
    }
}