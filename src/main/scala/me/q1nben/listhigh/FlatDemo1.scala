package me.q1nben.listhigh

object FlatDemo1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
        val l2 = l1.flatten
        println(l2)
        val strings = List("Hello world", "hello hello", "atkdjf aaa bbb")
//        val flatten = strings.map(_.split(" ")).flatten
        val flatten = strings.flatMap(_.split(" "))
        println(flatten)
    }
}
