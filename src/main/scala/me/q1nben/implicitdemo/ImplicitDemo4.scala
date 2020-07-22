package me.q1nben.implicitdemo

import java.io.File

import scala.io.Source

object ImplicitDemo4 {

    def main(args: Array[String]): Unit = {
        val content = new File("F:\\code2020\\scala\\scala-demo\\src\\main\\scala\\me\\q1nben" +
                "\\implicitdemo\\ImplicitDemo4.scala").readContent
        println(content)
    }

    implicit class RichFile(file: File) {
        def readContent(): String = {
            Source.fromFile(file).mkString
        }
    }

}
/*
隐式转换
    1. 隐式转换函数
    implicit def double2Int(d: Double) = d.toInt
    不看函数名，只看参数和返回值得类型
    存在两个满足条件的函数，就会报错

    2. 隐式类
    从2.10新增，开始有隐式类，对隐式转换函数的包装
        1. 不能为顶级类，必须是内部类
        2. 主构造必须有参数
        3. 隐式类优先级低于隐式转换函数，优先找隐式转化函数
        在spark中更多使用隐式转换函数
 */