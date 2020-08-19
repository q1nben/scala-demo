package me.q1nben.pattern

object PatternDemo4 {
    def main(args: Array[String]): Unit = {
        val a: Any = 100
        a match {
            case a: Int if a > 10 => println(a + 10)
            case s: String => println(s.toUpperCase)
            case b: Boolean => println(b)
            case _ =>
        }
    }
}
