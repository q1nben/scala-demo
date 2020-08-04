package me.q1nben.list

object List2 {
    def main(args: Array[String]): Unit = {
        // 炫技的写法，有人用过
        val l1 = ::[Int](1, 1 :: Nil)
        println(l1)
    }
}
