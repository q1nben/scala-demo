package me.q1nben.more

object More1 {
    def main(args: Array[String]): Unit = {
        val bb = new BB
        println(bb.isInstanceOf[AA])
        println(bb.isInstanceOf[BB])
        println(bb.isInstanceOf[Object])

        val aa:AA = bb.asInstanceOf[AA]
        aa.a()
    }
}

class AA {
    def a(): Unit = println("AA...")
}
class BB extends AA {
    def b(): Unit = println("BB...")
}