package me.q1nben.pattern

class People(val name: String, val age: Int)
object People {
    def unapply(pp: People): Option[(String, Int)] = {
        if (pp != null) Some(pp.name, pp.age)
        else None
    }
}
object ObjMatch {
    def main(args: Array[String]): Unit = {
        val p: People = new People("Tom", 20)

        p match {
            case People(name, age) =>
                println(name)
                println(age)
            case _ =>
        }
    }
}
