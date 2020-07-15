package me.q1nben.curry

import scala.annotation.tailrec

object CurryWhile {
    def main(args: Array[String]): Unit = {
        var a = 0
        curryWhile(a < 100) {
            println(a)
            a += 1
        }
    }

    @tailrec
    def curryWhile(condition: => Boolean)(op: =>Unit): Unit = {
        if (condition) {
            op
            curryWhile(condition)(op)
        }
    }
}

/*
 名调用，递归，柯里化
 */
