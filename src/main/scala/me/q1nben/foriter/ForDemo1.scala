package me.q1nben.foriter

object ForDemo1 {
    def main(args: Array[String]): Unit = {
        // val list: Range.Inclusive = 1.to(100)
        for (item <- 1 to 100) {
            println(item)
        }
        for (i <- 1 to(100, 2)) {       // to有两个参数分别为end和step
            println(i)
        }
        for (elem <- 1 to 100 by 2) {   // 通过by设置步长
            println(elem)
        }
        for (i <- 1 to 100 reverse) {
            println(i)
        }
        println("-----------")
        for (elem <- 100 to 1 by -1) {
            println(elem)
        }
    }
}
