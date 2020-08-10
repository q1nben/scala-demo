package me.q1nben.collections

object Slide1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(20, 30, 10, 5, 7)
        // 3为元素个数，2为步长
        val it = l1.sliding(3, 2)
        for (elem <- it) {
            println(elem)
        }
    }
}
