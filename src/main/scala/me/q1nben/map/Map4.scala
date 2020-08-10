package me.q1nben.map

import scala.collection.mutable

object Map4 {
    def main(args: Array[String]): Unit = {
        val m1 = mutable.Map[String, Int]("a" -> 100, "b" -> 200, "c" -> 300)
        println(m1)
        // more scala
        m1("a") = 500
        m1("f") = 555
        // more java
        m1.update("d", 400)
        println(m1)
    }
}
