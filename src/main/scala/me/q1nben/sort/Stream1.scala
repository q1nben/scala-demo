package me.q1nben.sort

object Stream1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, 50, 70, 60, 20, 10)
        val s1 = l1.toStream
        println(s1.head)
        println(s1)
        println(s1.tail.head)
        println(s1)
        // 只能取一次
        val s2 = s1.tail
        println(s2)
        s1.foreach(println)
        s2.foreach(println)
        // 强制求值
        println(s1.force)
        val ints = getS()
        // 无限流使用force会死循环
        // println(ints.force)
        // println(ints)
        println(ints.take(10).force)
        // toList也会死循环
        // println(ints.toList)
        println(fibSeq(30))
    }

    def getS(): Stream[Int] = {
        1 #:: getS
    }

    def fibSeq(n: Int) = {
        def loop(a: Int, b: Int): Stream[Int] = a #:: loop(b, a + b)
        loop(1, 1).take(n).force.toList
    }

    def fibSeq2(n: Int) = {
        def loop(): Stream[Int] = 1 #:: loop.scanLeft(1)(_ + _)
        loop.take(n).force.toList
    }
}
