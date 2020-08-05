package me.q1nben.tuple

object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        // 定义方式: 1. 原始
        val t2 = Tuple2(12, "123")
        println(t2._1)
        println(t2._2)
        // 2. 简化
        val t22 = (12, "123")
        println(t22)
    }
}
/*
    Tuple
        元组，一个特别简单，但特别重要的一个数据结构
        可以封装多个数据，且类型允许不同
        最多可以到Tuple22
 */
