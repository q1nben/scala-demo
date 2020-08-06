package me.q1nben.map

object Map2 {
    def main(args: Array[String]): Unit = {
        val m1 = Map[String, Int]("a" -> 100, "b" -> 200, "c" -> 300)
        // 推荐使用
        val i1 = m1.getOrElse("a", 100)
        println(i1)
        val i2 = m1("f")
        println(i2)
        // 不推荐
        val i3 = m1.get("a").get
        println(i3)
    }
}
