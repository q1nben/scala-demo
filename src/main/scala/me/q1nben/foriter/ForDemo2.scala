package me.q1nben.foriter

object ForDemo2 {
    def main(args: Array[String]): Unit = {
        // if是循环守卫
        for (elem <- 1 to 100 if elem % 2 == 1) {
            println(elem)
        }
        // until 0 until 100 右边为开 [0, 100)
        for (elem <- 0 until 100) {
            println(elem)
        }
        // 多个变量
        for (i <- 0 to 100 if i % 2 == 1; j = i * i) {
            println(s"i=$i, j=$j")
        }
        // 多个变量循环守卫. 任何一个守卫通过不了都不会执行后续语句
        for (i <- 0 to 100 if i % 2 == 1; j = i * i if j < 100; k = j * j if k < 1000) {
            println(s"i=$i, j=$j, k=$k")
        }
    }
}
