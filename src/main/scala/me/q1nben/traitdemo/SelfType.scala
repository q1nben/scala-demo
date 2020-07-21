package me.q1nben.traitdemo

object SelfType {
    def main(args: Array[String]): Unit = {
        val son = new Son
        son.foo()
        son.f()
    }
}

class Father {
    def f(): Unit = println("father...")
}

class My extends Father

trait F {
    self: Father =>
    def foo(): Unit = {
        // self加不加都可以
        self.f()
    }
}

/*
trait F extends Father {
    def foo(): Unit = {
        f()
    }
}
*/

class Son extends My with F