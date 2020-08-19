package me.q1nben.generic

object ViewBound {
    def main(args: Array[String]): Unit = {
        println(max(10, 20))
    }

    def max[T](x: T, y: T)(implicit ev$1: T => Ordered[T]) = {
        if (x > y) x
        else y
    }
}
/*
    视图绑定
    T <% Ordered[T] 表示一定存在隐式转换函数
 */