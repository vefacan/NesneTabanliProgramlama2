package com.example.nesnetabanliprogramlama2.paket2

import com.example.nesnetabanliprogramlama2.paket1.A

class B : A(){

    fun fonksiyon(){

        val nesne = A()

        println(varsayilanDegisken)
        println(publicDegisken)
        // println(privateDegisken) Erişilemez
        println(internalDegisken)
        println(protectedDegisken)
    }
}