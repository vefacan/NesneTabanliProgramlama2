package com.example.nesnetabanliprogramlama2

open class Hayvan {

    open fun sesCikar(){
        println("Sesim yok.")
    }
}

open class Memeli:Hayvan(){
}

class Kedi:Memeli(){

    override fun sesCikar(){
        println("Miyav.")
    }
}

class Kopek:Memeli(){

    override fun sesCikar() {
        println("Hav.")
    }
}