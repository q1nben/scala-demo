package me.q1nben.homework3

import scala.collection.immutable.Nil

object Homework {
    def main(args: Array[String]): Unit = {
        val l1 = Array[Int](1, 2, 3, 4)
        val l2 = List(Some(10), None, Some(20), Some(20))
        val tree3 = List(List(3, List(10, 20), 2, List(5)))
        val op = work8(l1)
        if (op.isDefined) {
            println(op.get.mkString(", "))
        } else {
            println("无值")
        }

        println(work9(l2))
        println(work9_2(l2))
        println(work9_3(l2))
        println(work9_4(l2))

        println(work10(tree3))
        work10_2(tree3)
        work11()
        println(work12())
    }

    def work8(arr: Array[Int]) = {
        arr match {
            case Array(a, b, rest@_*) =>
                Some(Array(b, a) ++ rest)
            case _ => None
        }
    }

    def work9(list: List[Option[Int]]) = list.filter(_.isDefined).map(_.get).sum

    def work9_2(list: List[Option[Int]]) = {
        list.foldLeft(0)(_ + _.getOrElse(0))
    }

    def work9_3(list: List[Option[Int]]) = {
        list.map(_.getOrElse(0)).sum
    }

    def work9_4(list: List[Option[Int]]) = {
        list.map(x => {
            x match {
                case a: Some[Int] => a.get
                case None => 0
            }
        }).sum
    }

    def work10(list: List[Any]) = {
        def sum(list: List[Any]):Int = {
            var num = 0
            list.foreach(x => x match {
                case e: Int => num += e
                case l: List[_] => num += sum(l)
            })
            num
        }
        sum(list)
    }
    def work10_2(tree: List[Any]) = {
        def sum(list: List[Any]):Int = {
            list.foldLeft(0)((num, e) => {
                e match {
                    case i: Int => num + i
                    case l: List[_] => num + sum(l)
                }
            })
        }
        println(sum(tree))
    }

    def work11(): Unit = {
        val tree = Node(Leaf(8), Node(Leaf(3), Leaf(9)))
        def sum(node: BinaryTree):Int = {
            node match {
                case Leaf(v) => v
                case Node(left, right) => sum(left) + sum(right)
            }
        }

        println(sum(tree))
    }

    def work12() = {
        def change(money: Int, coins: Array[Int]):Int = {
            if (money < 0 || coins.isEmpty) 0
            else if (money == 0) 1
            else change(money, coins.tail) + change(money - coins.head, coins)
        }
        change(11 , Array(1, 2, 5, 10))
    }
}

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree