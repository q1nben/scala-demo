package me.q1nben.listhigh

object FilterDemo {
    def main(args: Array[String]): Unit = {
        val l1 = List(10, 20, 50, 30, 5, 3)
        println(l1.filter(x => x % 2 == 0))
        println(l1.filter(_ % 2 == 0))
    }
}
