package me.q1nben.list

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object List3 {
    def main(args: Array[String]): Unit = {
        def printId(a1: Traversable[_]): Unit = {
            println(System.identityHashCode(a1))
        }
        var a1 = Array(30, 50, 70, 60, 10)
        printId(a1)
        a1 :+= 100
        printId(a1)
        println(a1.mkString(", "))
        var a2 = List(30, 50, 70, 60, 10)
        printId(a2)
        a2 :+= 100
        printId(a2)
        var a3 = ArrayBuffer(30, 50, 70, 60, 10)
        printId(a3)
        a3 :+= 100
        printId(a3)
        var a4 = ListBuffer(30, 50, 70, 60, 10)
        printId(a4)
        a4 :+= 100
        printId(a4)
    }
}
/*
    +=
    ++=
    一般用于可变集合
    也可以用于不可变集合
    实际上是将新的不可变集合赋给了变量
    加上:即使是可变集合也会调用其不可变的方法，返回一个新的集合
 */
