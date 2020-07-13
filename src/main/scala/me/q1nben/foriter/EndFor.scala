package me.q1nben.foriter

import scala.io.StdIn
import scala.util.control.Breaks._

object EndFor {
    def main(args: Array[String]): Unit = {
        val num = StdIn.readInt()
        var isPrime = true


        /*try {
            for (elem <- 2 until num) {
                isPrime = false
                throw new Exception
            }
        } catch {
            case _: Throwable =>
        }*/

        breakable(
            for (elem <- 2 until num) {
                if (num % elem == 0) {
                    isPrime = false
                    break
                }
            }
        )

        if (isPrime) {
            println(s"输入的数${num}是素数")
        } else {
            println(s"输入的数${num}不是素数")
        }
    }
}
