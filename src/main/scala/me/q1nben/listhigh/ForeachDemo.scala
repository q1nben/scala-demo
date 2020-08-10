package me.q1nben.listhigh

object ForeachDemo {
    def main(args: Array[String]): Unit = {
        // foreach 只进不出，返回值为Unit
        val l1 = List(10, 20, 50, 30, 5, 3)
        l1.foreach(println)
        l1.foreach(println _)
    }
}
