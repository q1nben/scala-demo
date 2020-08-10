package me.q1nben.listhigh

object GroupByDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 5, 7, 60, 1, 20)
        println(list1.groupBy(x => x % 2 == 0))
        println(list1.groupBy(x => x % 2))
        println(list1.groupBy(x => if (x % 2 == 0) "偶数" else "奇数"))
        val l2 = List("hello", "hello", "world", "atguigu", "hello", "world")
        val wordMap = l2.groupBy(x => x)
        val wordCount = wordMap.map(kv => {
            kv._1 -> kv._2.size
        })
        println(wordCount)
    }
}
