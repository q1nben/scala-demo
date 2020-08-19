package me.q1nben.extra

import java.util.{ArrayList => JAL}

import scala.collection.JavaConverters.asScalaBufferConverter
object JavaScala {
    def main(args: Array[String]): Unit = {
        // val list = new JAL[Int]().asScala
        import scala.collection.JavaConversions._
        val list = new JAL[Int]()
        list.add(100)
        list.add(10)
        list.add(100)
        list.add(100)
        list += 100
        list += 10
        list += 200
        list += 300
        for (e <- list) {
            println(e)
        }
    }
}
