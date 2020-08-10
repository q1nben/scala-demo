package me.q1nben.listhigh

object MapDemo1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(10, 20, 50, 30, 5, 3)
        val l2 = l1.map(x => x * x)
        println(l2)
        val l3 = l1.map(_ * 2)
        println(l3)
    }
}
