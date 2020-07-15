package me.q1nben.high

object Reduce {
    def main(args: Array[String]): Unit = {
        val arr1: Array[Int] = Array.range(1, 10)
        println(reduce(arr1, _ * _))
    }

    def reduce(array: Array[Int], op: (Int, Int) => Int): Int = {
        var last = array(0)
        for (elem <- 1 until array.length) {
            last = op(last, array(elem))
        }
        last
    }
}
