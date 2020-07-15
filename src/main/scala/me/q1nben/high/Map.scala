package me.q1nben.high

object Map {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(1, 2, 3, 4, 5)
        map(arr1, x => x * x).foreach(println)
    }

    def map(array: Array[Int], op: Int => Int): Array[Int] = {
        for (elem <- array) yield op(elem)
    }
}
