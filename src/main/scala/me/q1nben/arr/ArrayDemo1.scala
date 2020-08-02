package me.q1nben.arr

object ArrayDemo1 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array[Int](10, 20, 30, 50)
        println(arr1 :+ 100 mkString " ")
        println(100 +: arr1 mkString " ")
        println(arr1.+:(100).mkString(" "))
        println(arr1.:+(100).mkString(" "))

        val arr2 = Array[Int](60, 70, 80, 100)
        val arr3 = arr1 ++ arr2
        println(arr3.mkString(" "))
    }
}
/*
    <>: 由于历史原因给了xml, scala语言级别支持xml

    1. scala没有自己定义数组，底层就是java的数组。
    2. 创建数组;
        a. 直接通过给数组初始化元素

    3. 方法与运算符
        :+ 一般用于给不可变的集合添加单个元素在末尾
        +: 一般用于给不可变的集合添加单个元素到头部
        ++ 合并两个集合

        运算符有结合性:
        1 + 2 左结合
        +2 右结合
        a = 3 右结合
        只要是运算符是:结尾，均为右结合

 */
