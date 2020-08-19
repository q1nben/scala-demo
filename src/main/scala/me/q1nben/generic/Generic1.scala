package me.q1nben.generic

case class OrderedString(s: String) extends Ordered[OrderedString] {
    override def compare(that: OrderedString): Int = {
        s >= that.s match {
            case true => 1
            case false => -1
        }
    }
}
object Generic1 {
    def main(args: Array[String]): Unit = {
        val result = compare(OrderedString("a"), OrderedString("b"))
        println(result)
    }

    def compare[T <: OrderedString](x: T, y: T): T = {
        if (x > y) x
        else y
    }
}
