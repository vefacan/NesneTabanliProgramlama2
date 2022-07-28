package com.example.nesnetabanliprogramlama2

class Aslan {
}

open class Elma : Eatable, Squeezzable {

    override fun howToSquezze() {
        println("Blendır ile sık")
    }

    override fun howToEat() {
        println("Dilimleyerek ye.")
    }
}

class AmasyaElmasi : Elma(){

    override fun howToEat(){
        println("Yıka ve ye.")
    }

}



class Tavuk : Eatable {

    override fun howToEat() {
        println("Fırında kızart.")
    }
}