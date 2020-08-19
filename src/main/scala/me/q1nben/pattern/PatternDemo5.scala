package me.q1nben.pattern

object PatternDemo5 {
    def main(args: Array[String]): Unit = {
        val ints:Any = Array[Int](1, 2)
        ints match {
            case _: Array[Double] => println("Array[Double]")
            case _: Array[_] => println("Array[_]")
        }
        val strings = List[String]("aaa", "bbb")
        strings match {
            case _: List[_] => println("List[Int]")
        }
    }
}
/*
    scala中除了List, 其他泛型都是真正的泛型
    泛型模式匹配无法匹配除了泛型以外的类型
    泛型的存在是为了编译的时候类型更安全
    泛型只存在于源码和编译的时候，编译成字节码后，泛型就不存在了
 */
