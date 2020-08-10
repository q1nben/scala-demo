package me.q1nben.collections

object Opt1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, 40, 50, 60)
        println(l1.head)
        println(l1.last)
        println(l1.tail)
        println(l1.init)
        println(l1.size)
        println(l1.length)
        println(l1.toString)
        println(l1.mkString)
        println(l1.mkString(", "))
        println(l1.mkString("hello", ", ", "end"))

        val iterator = l1.iterator
        // 遍历迭代器
        while(iterator.hasNext) {
            val elem = iterator.next()
            println(elem)
        }
        val iterator2 = l1.iterator
        // 遍历2
        for (elem <- iterator2) {
            println(elem)
        }
        // 遍历完后，就没有元素了
        println(iterator2.contains(30))

    }
}
