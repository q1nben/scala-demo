package me.q1nben.listhigh

object FoldDemo2 {
    def main(args: Array[String]): Unit = {
        val m1 = Map[String, Int]("a" -> 100, "b" -> 200, "c" -> 300)
        val m2 = Map[String, Int]("a" -> 10, "b" -> 6, "c" -> 15)
        println(m1.foldLeft(m2)((map, kv) => {
            map + (kv._1 -> (kv._2 + map.getOrElse(kv._1, 0)))
        }))
    }
}
