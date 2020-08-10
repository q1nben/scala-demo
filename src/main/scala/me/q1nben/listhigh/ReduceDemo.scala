package me.q1nben.listhigh

object ReduceDemo {
    def main(args: Array[String]): Unit = {
        val l1 = List(10, 20, 50, 30, 5, 3)
        println(l1.reduce((x, y) => x + y))
        println(l1.reduce(_ + _))
        println(l1.reduceRight(_ - _))
    }
}
