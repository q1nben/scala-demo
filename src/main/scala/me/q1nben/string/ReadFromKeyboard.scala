package me.q1nben.string

import java.io.{BufferedReader, InputStreamReader}
import java.util.Scanner

import scala.io.StdIn

object ReadFromKeyboard {
    def main(args: Array[String]): Unit = {
        /*val scanner = new Scanner(System.in)
        println(scanner.nextLine())*/
        /*val reader = new BufferedReader(new InputStreamReader(System.in, "utf-8"))
        val str = reader.readLine()
        println(str)*/
        val str = StdIn.readLine("请输入：")
        println(str)
    }
}

/*'

    方法1：
    Java方法
    val scanner = new Scanner(System.in)
    println(scanner.nextLine())

    方法2：
    Java方法 1.5之前
    val reader = new BufferedReader(new InputStreamReader(System.in, "utf-8"))
    val str = reader.readLine()
    println(str)

    方法3：
    scala方法
    val str = StdIn.readLine("请输入：")
    println(str)
 */