package me.q1nben.high

object Filter {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 5, 7, 100, 9)
        filter(arr1, x => x % 2 == 0).foreach(println)
    }

    def filter(array: Array[Int], condition: Int => Boolean): Array[Int] = {
        for (elem <- array if condition(elem)) yield elem
    }
}
