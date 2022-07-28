package com.example.nesnetabanliprogramlama2

open class Ev(var pencereSayisi: Int) {

}

class Saray(pencereSayisi: Int, var kuleSayisi: Int) : Ev(pencereSayisi) {

}

class Villa(pencereSayisi: Int, var garajVarMi: Boolean) : Ev(pencereSayisi) {

}