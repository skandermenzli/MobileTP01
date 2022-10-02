package com.example.tp01

class Rectangle(val p:Point = Point(0,0), val q:Point = Point(1,1)) {

    override fun toString(): String =  "p=$p q=$q";

    fun surface(largeur:Int,longeur:Int) = largeur*longeur


}