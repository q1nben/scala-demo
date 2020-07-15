package me.q1nben.recursive

import scala.annotation.tailrec

object TailRecursive {
    def main(args: Array[String]): Unit = {
        println(factorial(60, acc = 1))
    }

    @tailrec
    def factorial(n: Int, acc: BigInt): BigInt = {
        if (n == 1) acc
        else factorial(n - 1, n * acc)
    }
}
