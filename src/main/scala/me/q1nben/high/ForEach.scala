package me.q1nben.high

object ForEach {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 10, 20, 40, 50)
        foreach(arr1, println)
    }

    def foreach(array: Array[Int], op: Int => Unit): Unit = {
        for (elem <- array) {
            op(elem)
        }
    }
}
