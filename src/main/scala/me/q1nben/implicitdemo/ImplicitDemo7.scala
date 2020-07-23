package me.q1nben.implicitdemo

object ImplicitDemo7 {
    implicit val a: Int = 10
    def main(args: Array[String]): Unit = {
        /*val b = implicitly[Int]
        println(b)*/
        foo
        foo(implicitly[Int])
    }

    def foo(implicit a: Int): Unit = println(a)
}
/*
    从冥界召唤隐式值
    from summoning implicit values from the nether world
 */