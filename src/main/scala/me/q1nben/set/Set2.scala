package me.q1nben.set

import scala.collection.mutable
object Set2 {
    def main(args: Array[String]): Unit = {
        val s1 = mutable.Set(1, 2, 3, 4)
        s1 += 100
        println(s1)
        // 使用set去重
        val l1 = List(10, 20, 70, 20, 100, 10, 100, 50, 70)
        val l2 = l1.toSet.toList
        println(l2)
    }
}
