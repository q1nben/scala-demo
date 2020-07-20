package me.q1nben.homework1

object Homework03 {
    def main(args: Array[String]): Unit = {
        val rec = new Rectangle(Point(3, 4), Point(10, 100))
        println(rec.centerPoint)
        println(rec.area)

        val circle = new Circle(Point(0, 0), 100)
        println(circle.centerPoint)
        println(circle.area)
    }
}

abstract class Shape {
    def centerPoint: Point
    def area: Double
}

class Rectangle(val leftTop: Point, val rightBottom: Point) extends Shape {
    override def centerPoint: Point = Point((leftTop.x + rightBottom.x) / 2, (leftTop.y + rightBottom.y) / 2)

    override def area: Double = ((leftTop.x - rightBottom.x) * (leftTop.y - rightBottom.y)).abs
}

class Circle(val center: Point, val r: Double) extends Shape {
    override def centerPoint: Point = center

    override def area: Double = math.Pi * r * r
}