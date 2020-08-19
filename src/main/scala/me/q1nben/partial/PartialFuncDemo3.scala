package me.q1nben.partial

object PartialFuncDemo3 {
    def main(args: Array[String]): Unit = {
        val map = Map("a" -> 97, "b" -> 98, "c" -> 99)
        map.foreach({
            case (k, v) =>
                println(k)
                println(v)
        })
        val tuples = List(("a", ("b", (2, "c"))), ("aa", ("bb", (22, "cc"))))
        val ints = tuples.map({
            case (_, (_, (x, _))) => x
        })
        println(ints)

        println(foo({
            case (x, y) => x + y
        }))
        println(foo(xy => xy._1 + xy._2))
    }

    def foo(f: ((Int, Int)) => Int ) = f((10, 20))
}
/*
    偏函数在collect之外使用，当做普通函数来使用其模式匹配的功能
    如果函数参数是元组的时候，用偏函数更好。
 */