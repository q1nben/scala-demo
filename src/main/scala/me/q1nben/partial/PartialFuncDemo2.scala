package me.q1nben.partial

object PartialFuncDemo2 {
    def main(args: Array[String]): Unit = {
        val l1 = List(1, 2, 3, "aaa", false)
        val l2 = l1.collect({
            case a: Int => a
        })
        println(l2)
    }
}
