package me.q1nben.homework2

import scala.::

object Homework {
    def main(args: Array[String]): Unit = {
        work1()
        work2()
        work3()
        work4()
        work5()
        work6()
    }

    def work1(): Unit = {
        val l1 = List(70, 60, 50, 10, 20, 80)
        println(l1.reduce((x, y) => if (x > y) x else y))
        println(l1.reduce((x, y) => x max y))
        println(l1.reduce(_ max _))
    }

    def work2(): Unit = {
        val l1 = List(70, 60, 50, 10, 20, 80)
        // 或者使用Int的最大最小值, (Int.MaxValue, Int.MaxValue)
        println(l1.foldLeft((l1.head, l1.head))((minMax, i) => {
            (minMax._1 min i) -> (minMax._2 max i)
        }))
    }

    def work3(): Unit = {
        val s1 = "Hellolloee"
        val index = s1
                .zipWithIndex
                .groupBy(_._1)
                .mapValues(_.toList.map(_._2))
        println(index)
    }

    def work4(): Unit = {
        val l1 = List("hello", "xixi", "ok")
        println(mkString(l1, "<<", ", ", ">>"))
        def mkString(list: List[String], start: String, sep: String, end: String): String = {
//            val mid = list.foldLeft("")(_ + sep + _).replaceFirst(sep, "")
        val mid = list.foldLeft("")(_ + sep + _).substring(sep.length)
            s"$start$mid$end"
        }
    }

    def work5(): Unit = {
        def reverse(s: String): String = {
            s.foldLeft("")((x, y) => y + x)
        }
        val s1 = "hello"
        println(reverse(s1))
        def reverse2(s: String): String = {
            if (s.isEmpty) s
            else reverse2(s.tail) + s.head
        }
    }

    def work6(): Unit = {
        val l1 = List(1, 2, 3, 4)
        def reverse(list: List[Int]): List[Int] = {
            if (list.isEmpty) list
            else reverse(list.tail) :+ list.head
        }
        def reverse2(list: List[Int]): List[Int] = {
            list.foldLeft(List[Int]())((l, e) => {
                e :: l
            })
        }
        println(reverse(l1))
        println(reverse2(l1))
    }
}
