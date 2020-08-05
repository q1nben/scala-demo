package me.q1nben.tuple

object TupleDemo3 {
    def main(args: Array[String]): Unit = {
        val abc = /% _
        println(abc(5, 3))
        println(5 /% 3)
    }

    def /%(a: Int, b: Int): (Int, Int) = {
        (a / b, a % b)
    }

    implicit class RichInt(a: Int) {
        def /%(b: Int): (Int, Int) = (a / b, a % b)
    }
}
