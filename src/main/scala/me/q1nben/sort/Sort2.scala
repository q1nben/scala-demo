package me.q1nben.sort

class Student(val age: Int, val name: String) {
    override def toString: String = s"[name = $name, age = $age]"
}
object Sort2 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, 50, 70, 60, 20, 10)
        println(l1.sortBy(x => x)(Ordering.Int.reverse))
        val strings = List("hello", "world", "atguigu", "aaa", "b")
        println(strings.sortBy(_.length))
        println(strings.sortBy(-_.length))
        println(strings.sortBy(_.length)(Ordering.Int.reverse))
        // 多个指标，用元组来传递, Ordering最多支持Tuple9
        println(strings.sortBy(x => (x.length, x)))
        println(strings.sortBy(x => (x.length, x))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String)))
        val students = List(new Student(10, "c"), new Student(30, "a"),
            new Student(25, "b"), new Student(10, "d"))
        println(students.sortBy(student => (student.age, student.name)))
        println(students.sortBy(student => (student.age, student.name))(Ordering.Tuple2(Ordering.Int, Ordering.String.reverse)))
    }
}
