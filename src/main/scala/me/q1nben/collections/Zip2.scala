package me.q1nben.collections

object Zip2 {
    def main(args: Array[String]): Unit = {
        val tuples = List("a" -> 100, "b" -> 200, "c" -> 300)
        // 只有List中存储2元组才能使用unzip，map也可以
        val unzip = tuples.unzip
        println(unzip._1)
        println(unzip._2)
        val map = Map("a" -> 100, "b" -> 200, "c" -> 300)
        val unzip1 = map.unzip
        println(unzip1._1)
        println(unzip1._2)

    }
}
