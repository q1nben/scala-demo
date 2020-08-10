package me.q1nben.collections

object Zip1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, 50, 70, 60, 10, 20, 100)
        val l2 = List(3, 5, 7, 6, 1, 2)
        val l3 = l1.zip(l2)
        println(l3)
        val l4 = l1.zipAll(l2, -1, -2)
        println(l4)
        val index = l1.zipWithIndex
        println(index)
        for ((e, i) <- index) {
            println(e)
            println(i)
        }
    }
}
