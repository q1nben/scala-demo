package me.q1nben.sort

object Sort3 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, 50, 70, 60, 20, 10)
        println(l1.sortWith(_ > _))
        println(l1.sortWith(_ < _))
    }
}
