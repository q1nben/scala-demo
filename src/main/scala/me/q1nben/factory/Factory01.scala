package me.q1nben.factory

import scala.collection.mutable

object Factory01 {
    def main(args: Array[String]): Unit = {
        println(Human.getHuman("黑人"))
        println(Human.getHuman("白人"))
        println(Human.getHuman("黑人"))
        println(Human.getHuman("白人"))
        println(Human.getHuman("黑人"))
        println(Human.getHuman("黄人"))
        println(Human)
    }
}

object Human {
    val map: mutable.Map[String, Human] = mutable.Map[String, Human](
        elems = "黑人" -> new Human("黑人")
    )

    def getHuman(color: String): Human = map.getOrElseUpdate(color, new Human(color))
}

class Human private (color: String) {
    println(s"$color...")
    override def toString: String = s"人种: $color"
}