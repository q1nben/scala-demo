package me.q1nben.set

object Set1 {
    def main(args: Array[String]): Unit = {
        var s1 = Set(1, 2, 3, 5, 1, 2)
        println(s1)
        s1 += 100
        println(s1)
        val s2 = Set(1, 2, 3, 4, 5)
        val s3 = s2 + 100
        println(s3)
        val s4 = Set(1, 2, 4, 45, 32, 50)
        val s5 = Set(1, 3, 4, 45, 100, 120)
        // val s6 = s4 ++ s5
        // val s6 = s4 union s5
        val s6 = s4 | s5
        // val s7 = s4 intersect s5
        val s7 = s4 & s5
        // val s8 = s4 diff s5
        // val s8 = s4 -- s5
        val s8 = s4 &~ s5
        println(s6)
        println(s7)
        println(s8)
    }
}
/*
    Set 可变 不可变 默认不可变
    无重复项，可以用来去重
    Set 更加代数化，其实就是指的代数里的集合
    并集
        ++
        |
        union
    交集
        &
        intersect
    差集
        --
        diff
        &~
*/