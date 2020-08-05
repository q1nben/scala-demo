package me.q1nben.map

object Map1 {
    def main(args: Array[String]): Unit = {
        val m1 = Map[String, Int](("a", 97), ("b", 98), ("c", 99), ("z", 1))
        for (elem <- m1) {
            println(elem)
            println(elem._1)
            println(elem._2)
        }
        for ((k, v) <- m1) {
            println(k)
            println(v)
        }
        for((k, _) <- m1) {
            println(k)
        }
        val m2 = Map[String, Int]("a" -> 100, "b" -> 101, "c" -> 102, "f" -> 1)
        val m3 = m2 + ("a" -> 200)
        println(m2)
        println(m3)
        val m4 = m1 ++ m3
        println(m4)
    }
}
