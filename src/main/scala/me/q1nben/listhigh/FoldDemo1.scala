package me.q1nben.listhigh

object FoldDemo1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(10, 20, 50, 30, 5, 3)
        println(l1.foldLeft(0: Double)(_ + _))
        println(l1.foldLeft("")(_ + _))
        println(l1.foldRight("a")(_ + _))
        println((l1 :\ "a") (_ + _))
        println(("a" /: l1) (_ + _))
        println((l1./:("a")) (_ + _))
        println(l1.:\("a")(_ + _))
    }
}
