package me.q1nben.listhigh

object PartFunDemo {
    def main(args: Array[String]): Unit = {
        val square: Double => Double = math.pow(_, 2)
        println(square(10))
    }
}
