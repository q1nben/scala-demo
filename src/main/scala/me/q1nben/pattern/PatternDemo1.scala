package me.q1nben.pattern

import scala.io.StdIn

object PatternDemo1 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val op = StdIn.readLine("请输入运算符: ")
        op match {
            case "+" =>
                println(a + b)
            case "-" =>
                println(a - b)
            case "*" =>
                println(a * b)
            case "/" =>
                println(a / b)
            case _ =>
                println("运算符输入出错")
        }
    }
}
/*
    模式匹配
    函数式编程语言的标配
    有点类似Java的switch

 */
