package com.example.nesnetabanliprogramlama2

fun main() {

    val aslan = Aslan()
    val amasyaElmasi: Elma = AmasyaElmasi()
    val tavuk:Eatable = Tavuk()
    val elma = Elma()


    val nesneler = arrayOf(aslan,amasyaElmasi,tavuk,elma)

    for (nesne in nesneler){

        if (nesne is Eatable){

            nesne.howToEat()

        }

        if (nesne is Squeezzable){

            nesne.howToSquezze()
        }
    }
}