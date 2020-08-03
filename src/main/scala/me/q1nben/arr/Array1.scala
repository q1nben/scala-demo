package me.q1nben.arr

import me.q1nben.MyApp

object Array1 extends MyApp {
    def main(args: Array[String]): Unit = {
        // 创建长度为10的int数组 等价于java: new Int[10]
        val arr1 = new Array[Int](10)
        myPrint(arr1)
    }
}
/*
    定长数组的创建：
    1. 通过元素直接初始化数组
        val arr = Array[Int](1, 2, 3)
    2. 创建的时候指定数组长度
 */