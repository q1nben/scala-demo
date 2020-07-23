package me.q1nben.implicitdemo

object ImplicitDemo5 {
    def main(args: Array[String]): Unit = {
        implicit val aa: Int = 10
        implicit val bb: Double = 10.1
//        implicit val bb: Int = 100
        foo(100, 100)
        foo
        foo2(10)
        foo3
        foo3()
    }

    def foo(implicit a: Int, b: Double): Unit = {
        println(a)
        println(b)
    }

    def foo2(a: Int)(implicit b: Int, c: Double): Unit = {
        println("foo2...")
        println(a)
        println(b)
        println(c)
    }

    def foo3(implicit a: Int = 100): Unit = {
        println(a)
    }
}

/*
    1. 是一种约定机制，当存在两个及以上符合条件的隐式值，无法编译成功。
    2. 如果定义了隐式参数，所有的参数列表都会变成隐式。
       可以通过柯里化来解决将参数列表全变为隐式的问题。
    3. 当隐式值和默认值均存在时，使用小括号调用默认值，没有小括号调用隐式值，不存在优先级问题。
       当不存在隐式值的时候，两种方式都会调用默认值。无小括号实际上是先查找隐式值，没有就调用默认值。
 */

