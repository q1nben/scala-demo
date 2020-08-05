package me.q1nben.arr

import scala.collection.mutable.ArrayBuffer

object Array3 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(1, 2, 3, 4)
        val buffer = arr1.toBuffer
        println(buffer)
        val arrayBuffer1 = ArrayBuffer(1, 2, 3, 4, 5)
        println(arrayBuffer1.toArray.mkString(", "))
    }
}
