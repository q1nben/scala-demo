package me.q1nben.homework1

object Homework01 {
    def main(args: Array[String]): Unit = {
        println(Point(3, 4))
    }
}

object Point {
    def apply(x: Int, y: Int): Point = new Point(x, y)
}

class Point(val x: Int, val y: Int) {
    override def toString: String = s"x = $x, y = $y"
}