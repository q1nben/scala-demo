package me.q1nben.arr

import me.q1nben.MyApp

import scala.collection.mutable.ArrayBuffer

object Array2 extends MyApp {
    def main(args: Array[String]): Unit = {
        var arr1 = ArrayBuffer(1, 2, 3, 4)
        val arr2 = new ArrayBuffer[Int]()
        myPrint(arr1)
        myPrint(arr2)
        println(100 +: arr1 :+ 100)
        // += 原地修改
        arr1 += 100
        println(arr1)
        200 +=: arr1
        println(arr1)
        200 +=: arr2
        val arr3 = arr1 ++ arr2
        println(arr3)
        arr1 ++= arr2
        println(arr1)
        val arr4 = ArrayBuffer(10, 23, 213, 213)
        val arr5 = ArrayBuffer(213, 3123, 434)
        arr4 ++=: arr5
        println(arr4)
        println(arr5)
        arr1 -= 100
        println(arr1)
        println(arr4)
        println(arr5)
        arr1 --= arr2
        println(arr1)
        // 官方不建议使用
        arr1 -= (1, 2, 3, 4)
        println(arr1)
    }
}
/*
    可变数组:
    ArrayBuffer
    创建:
    1. ArrayBuffer(1, 2, 3)
    2. new ArrayBuffer[Int]()

    += 一般用于可变集合，表示原地修改
    :+= ？？？？
    +=: 头部添加

    ++= 把后面集合的元素合并到前面的集合中
    ++=: 把前面集合的元素合并到后面的集合中

    -= 删除元素，不存在则不删除，若存在多个，只删除满足的第一个(set用的比较多)
 */