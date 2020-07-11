package me.q1nben.string

object StringInterpolation {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val s = s"a * 10 = ${a * 10}, b = $b"
        println(s)
        val raw = raw"\n\t"
        println(raw)
    }
}
