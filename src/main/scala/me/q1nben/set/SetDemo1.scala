package me.q1nben.set

object SetDemo1 {
    def main(args: Array[String]): Unit = {
        val set1 = Set[Int](10, 20, 30, 40)
        val set2 = Set[Int](20, 30, 40, 100)
        println(set1 ++ set2)
        println(set1 | set2)
        println(set1 union set2)
        println(set1 & set2)
        println(set1 intersect set2)
        println(set1 &~ set2)
    }
}
