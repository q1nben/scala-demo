package me.q1nben.collections

object Opt2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 20, 60, 10, 20)
        // 1. 反转
        println(list1.reverse)
        // 2. 获取前几个
        val list2 = list1.take(2)
        println(list2)
        // 3. 抛弃前几个
        println(list1.drop(2))
        // 4. 按条件获取
        println(list1.takeWhile(x => x >= 30))
        println(list1.dropWhile(x => x < 40))
        println(list1.takeRight(2))
        println(list1.dropRight(2))
    }
}
