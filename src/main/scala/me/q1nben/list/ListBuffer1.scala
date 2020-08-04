package me.q1nben.list

import scala.collection.mutable.ListBuffer

object ListBuffer1 {
    def main(args: Array[String]): Unit = {
        val l1 = ListBuffer(1, 2, 3)
        l1 += 10
        100 +=: l1
        print(l1)
    }
}
