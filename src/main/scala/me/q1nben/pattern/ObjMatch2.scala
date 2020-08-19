package me.q1nben.pattern

object MyArray {
    def unapplySeq(s: String) = {
        if (s != null) {
            Some(s.split(",").toList)
        } else None
    }
}
object ObjMatch2 {
    def main(args: Array[String]): Unit = {
        val names = "zhangsan,lisi,wangwu,fengjie"
        names match {
            case MyArray(a, b, rest@_*) =>
                println(a)
                println(b)
                println(rest)
            case _ =>
        }
    }
}
