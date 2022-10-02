package com.example.tp01

import kotlin.math.abs

fun main(argv : Array<String> ){
    println("Hello world")

    val point1 = Point(1,1)
    val point2 = Point(3,3)



    fun distance(p: Point, q:Point):Int{
        return abs(p.x-q.x) + abs(p.y-q.y)
    }
    //println(distance(point1,point2))

    var rec_array = arrayOf(Rectangle(), Rectangle(Point(3,3)),Rectangle(q=Point(2,1)),Rectangle(Point(5,1),Point(4,2)))


    for (rec in rec_array){
        val largeur = distance(rec.p, Point(rec.p.x,rec.q.y))
        val longeur = distance(rec.q, Point(rec.p.x,rec.q.y))
        print("la surface du rectangle $rec est:")
        println(rec.surface(largeur,longeur))

    }






}


