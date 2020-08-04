package me.q1nben.list

object List1 {
    def main(args: Array[String]): Unit = {
        // 有元素的集合
        val list1 = List(1, 2, 3)
        // 空集合
        val list2 = List[Int]()
        // 空集合(推荐使用)
        val list3 = Nil
        val list4 = 200 +: list1 :+ 100

        val list5 = 100 :: list2.::(100)
        val list6 = list1 ++ list5
        val list7 = list1 ::: list5
        println(list4)
        println(list5)
        println(list6)
        println(list7)
    }
}
/*
    List
    列表
    默认不可变

    List专用:
    ::
    ::: 合并两个list
 */
