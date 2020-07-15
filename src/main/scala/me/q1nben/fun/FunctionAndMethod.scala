package me.q1nben.fun

object FunctionAndMethod {
    def main(args: Array[String]): Unit = {
        def add(a: Int, b: Int, c: Int = 3) = {
            a + b + c
        }
        println(add(100, 20))
        val f1 = add _
        val f2: (Int, Int, Int) => Int = add
        println(f1(100, 20, 3))
        println(f2(100, 20, 3))
   }
}
