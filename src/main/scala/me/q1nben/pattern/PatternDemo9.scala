package me.q1nben.pattern

object PatternDemo9 {
    def main(args: Array[String]): Unit = {
        val (a, b) = foo
        val Array(a1, b1, rest@_*) = foo1()
        println(a)
        println(b)
        println(a1)
        println(b1)
        println(rest)
        val tuples = List((10, 20), (100, 200), (50, 100))

    }

    def foo() = ("Tom", 20)

    def foo1() = Array[Int](1, 2, 3, 4, 5)
}
