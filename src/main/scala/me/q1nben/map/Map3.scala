package me.q1nben.map

import scala.collection.mutable

object Map3 {
    def main(args: Array[String]): Unit = {
        val m1 = mutable.Map[String, Int]("a" -> 100, "b" -> 200, "c" -> 300)
        m1 += ("f" -> 500)
        println(m1)
        val i = m1.getOrElse("f", 100)
        println(i)
        m1.getOrElseUpdate("a", 200)
        println(m1)
        m1.getOrElseUpdate("e", 200)
        println(m1)
    }
}
