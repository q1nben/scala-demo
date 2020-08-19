package me.q1nben.partial

object PartialFuncDemo4 {
    def main(args: Array[String]): Unit = {
        val op: Option[Int] = Some(10)

        val v = op match {
            case Some(x) => x
            case None => 0
        }
        println(v)
    }
}
