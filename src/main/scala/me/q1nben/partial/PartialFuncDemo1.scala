package me.q1nben.partial

object PartialFuncDemo1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(1, 2, 3, "aaa", false)
        val a1 = Array[Any](1, 2, 3, "aaa", false)
        val partialFunc = new PartialFunction[Any, Int] {
            override def isDefinedAt(x: Any): Boolean = x match {
                case i: Int => true
                case _ => false
            }
//            x.isInstanceOf[Int]

            override def apply(v1: Any): Int = v1 match {
                case i: Int => i
            }
//                v1.asInstanceOf[Int]
        }
        println(l1.collect(partialFunc))
        val a2 = a1.collect(partialFunc)
        println(a2.mkString(","))
    }
}
