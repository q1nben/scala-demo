package me.q1nben.extra

object Part1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, 50, 70, 60, 20, 10)
        l1.foreach(_ => println(Thread.currentThread.getName))
        l1.par.foreach(_ => println(Thread.currentThread.getName))
    }
}
/*
    并行集合：

 */
