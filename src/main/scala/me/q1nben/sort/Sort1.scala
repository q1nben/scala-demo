package me.q1nben.sort

/*class User(val age: Int, val name: String) extends Comparable[User] {
    override def compareTo(o: User): Int = age - o.age
    override def toString: String = s"[age = $age, name = $name]"
}*/
class User(val age: Int, val name: String) extends Ordered[User] {

    override def toString: String = s"[age = $age, name = $name]"

    override def compare(that: User): Int = this.age - that.age
}
object Sort1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, 50, 70, 60, 20, 10)
        println(l1)
        println(l1.sorted)
        println(l1.sorted.reverse)
        val users = List(new User(10, "tom"), new User(5, "bob"), new User(20, "tok"))
        println(users.sorted)
        val user1 = new User(10, "paul")
        val user2 = new User(10, "john")
        println(user1 >= user2)
        println(l1.sorted(Ordering.Int))
        println(l1.sorted(Ordering.Int.reverse))
        implicit val ord = new Ordering[User] {
            override def compare(x: User, y: User): Int = x.age - y.age
        }
        println(users.sorted)
        println(users.sorted(ord.reverse))
    }
}

/*
    scala中不管是可变集合还是不可变集合都是返回一个排好序的新集合
    sorted
    默认自然排序（升序）
    1. 让排序的类型有自己的排序功能
        Ordered 实质上就是Java中的Comparable
    2. 使用第三方的比较器

    sortBy more scala
        不需要提供任何的逻辑代码，只需要指定排序的指标

    sortWith more scala
        传递一个函数，然后在函数里写比较规则
 */