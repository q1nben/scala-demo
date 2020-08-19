package me.q1nben.option

object OptionDemo1 {
    def main(args: Array[String]): Unit = {
//        val op = get
//        if (op.isDefined) {
//            println(op.get)
//        }
        val op = sqrt(9)
        if (op.isDefined) {
            println(op.get)
        } else {
            println("没有平方根")
        }
    }

    def get: Option[Int] = Some(10)
//    def get: Option[Int] = None

    def sqrt(n: Double): Option[Double] = {
        if (n >= 0) Some(math.sqrt(n))
        else None
    }
}
