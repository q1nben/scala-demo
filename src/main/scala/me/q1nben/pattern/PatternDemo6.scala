package me.q1nben.pattern

object PatternDemo6 {
    def main(args: Array[String]): Unit = {
        val ints = Array(1, 2, 3, 4)
        ints match {
            case Array(2, 2, a, b) =>
                println(a)
                println(b)
            case Array(a, b, c, d) =>
                println((a, b, c, d))
            case _ =>
        }
        val i2 = Array(2, 2, 3, 4, 5, "abc", 3.3)
        i2 match {
            // _* 可以匹配0到多个, 相当于可变参数，只能放在最后
            /*case Array(2, 2, _*) =>
                println("(2, 2, _*)")*/
            case Array(2, 2, abc@_*) =>
                println(abc.toList)
            case _ =>
        }
    }
}
/*
    模式匹配深入到集合的内部
 */