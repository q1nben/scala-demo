package me.q1nben

class MyApp {
    def myPrint(any: Traversable[_]): Unit = {
        println(any.mkString(", "))
    }
}
