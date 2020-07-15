package me.q1nben.curry

object CurryDemo {
    def main(args: Array[String]): Unit = {
        val f1 = add(2)_
        println(f1(3))
        val f2: Int => Int = add(2)
        println(f2(2))
    }

    def add(x: Int)(y: Int): Int = x + y
}
