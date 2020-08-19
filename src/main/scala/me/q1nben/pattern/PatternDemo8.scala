package me.q1nben.pattern

object PatternDemo8 {
    def main(args: Array[String]): Unit = {
        val l1 = List(10, 20, 30, 40)
        l1 match {
//            case List(10, 20, c, d) =>
//                println(s"List(10, 20, $c, $d)")
//            case List(10, abc@_*) =>
//                println(abc)
//            case a :: b :: c :: d :: Nil =>
//                println(a)
//                println(b)
//                println(c)
//                println(d)
//            case a :: _ =>
//                println(a)
            case a :: rest => // 最后一个一定是List集合
                println(a)
                println(rest)
        }
    }
}
