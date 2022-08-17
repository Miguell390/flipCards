package com.example.week3cards

class Card(val rank: String, val suit: String, var fliped: Boolean =  true) {

    fun flip() {
        fliped = !fliped
    }


    fun printDetails(){
        if(fliped){
            println("ACE HEARTS")
        } else println("-------")
    }

    fun getDetails(): String{
        if(fliped){
            return "$rank $suit"
        }else return "---------"
    }


}