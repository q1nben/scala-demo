package me.q1nben.foriter

object LoopNest {
    def main(args: Array[String]): Unit = {
        // 嵌套循环当代码逻辑都在内循环使用起来比较方便，一般用的比较少
        for (i <- 1 to 9; j <- 1 to i) {
            print(s"$j * $i = ${i * j}\t")
            if (i == j) println()
        }
    }
}
