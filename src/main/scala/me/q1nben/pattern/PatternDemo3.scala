package me.q1nben.pattern

import scala.io.StdIn

object PatternDemo3 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val op = StdIn.readLine("请输入运算符: ")
        val t1 = op match {
            case "+" =>
                a + b
            case "-" =>
                a - b
            case "*" =>
                a * b
            case "/" =>
                a / b
            case _ => -1
        }
        println(t1)
    }
}
