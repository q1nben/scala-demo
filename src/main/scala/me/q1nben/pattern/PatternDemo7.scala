package me.q1nben.pattern

object PatternDemo7 {
    def main(args: Array[String]): Unit = {
        val t1 = ("tom", 12)
        t1 match {
            /*case (name, age) =>
                println(name)
                println(age)*/
            case (name: String, age) =>
                println(name)
                println(age)
        }
    }
}
