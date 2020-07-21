package me.q1nben.enumdemo

object MulEnum {
    def main(args: Array[String]): Unit = {
        println(Season.Spring)
        println(Season.judge(1))
    }
}

// 方法1
// 使用sealed和object单例模拟枚举，无法在文件外创建对象
sealed abstract class Father
object son1 extends Father
object son2 extends Father
object son3 extends Father
object son4 extends Father

// 方法2
// 在java中使用原生枚举然后调用

// 方法3
// 使用scala官方定义的枚举，继承
object Season extends Enumeration {
    type Season = Value
    val Spring, Summer, Autumn, Winter = Value

    def judge(month: Int): Any = {
        if (month >= 1 && month <= 3) Spring
    }
}