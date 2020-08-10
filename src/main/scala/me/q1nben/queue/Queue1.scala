package me.q1nben.queue

import scala.collection.mutable

object Queue1 {
    def main(args: Array[String]): Unit = {
        val q1 = mutable.Queue[Int](10, 20, 30)
        q1.enqueue(100, 200)
        println(q1)
        val v = q1.dequeue()
        println(q1)
        println(v)
        // 栈底和java相反
        val s1 = mutable.Stack[Int](10, 20, 30)
        val i = s1.pop()
        println(i)
        println(s1)
        s1.push(100, 300)
        println(s1)
    }
}
/*
    队列
    FIFO
    入队出队
    栈
    FILO
    入栈出栈
 */
