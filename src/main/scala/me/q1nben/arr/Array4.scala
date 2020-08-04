package me.q1nben.arr

object Array4 {
    def main(args: Array[String]): Unit = {
        val arr = Array.ofDim[Int](2, 3)
        println(arr(0)(1))
        for (a1 <- arr) {
            for (elem <- a1) {
                println(elem)
            }
        }
    }
}
