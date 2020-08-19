package me.q1nben.exception

import java.io.FileInputStream

object ExceptionDemo1 {
    def main(args: Array[String]): Unit = {
        try {
            var i = 1 / 0
            new FileInputStream("aa")
        } catch {
            case e: ArithmeticException =>
                println("发生算术异常")
            case e: Exception =>
                println("运行时异常")
            case _ =>
        } finally {
            // 不管有没有异常都会走这里
            println("释放资源")
        }
        println("aaa")
    }
}
