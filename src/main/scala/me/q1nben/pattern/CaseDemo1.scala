package me.q1nben.pattern

case class User(age: Int, name: String)
object CaseDemo1 {
    def main(args: Array[String]): Unit = {
        val user1 = User(20, "Tom")
        user1 match {
            case User(age, name) =>
                println(age)
                println(name)
            case _ =>
        }
    }
}
