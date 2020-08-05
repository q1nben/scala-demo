package me.q1nben.tuple

object TupleDemo2 {
    def main(args: Array[String]): Unit = {
        val t4 = (1, 2, true, false)
        for (elem <- t4.productIterator) {
            println(elem)
        }
        val t2 = (1, true)
        val t22 = 1 -> true
    }
}
/*
    Tuple2使用的比较多，可以使用类似键值对的形式创建
 */
