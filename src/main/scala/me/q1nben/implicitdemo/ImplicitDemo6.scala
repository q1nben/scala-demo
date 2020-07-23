package me.q1nben.implicitdemo

class A
class B
object B {
    implicit def b2A(b: B): A = {
        println("B...")
        new A()
    }
}
object A {
//    implicit def b2A(b: B) = {
//        println("A...")
//        new A()
//    }
}
object ImplicitDemo6 {
    def main(args: Array[String]): Unit = {
        /*implicit def b2A(b: B) = {
            println("main...")
            new A()
        }*/
        val a: A = new B()
    }
}
/*
    隐式查找路径问题，按下列顺序查找，同一个路径不能有两个满足条件的函数
    1. 先在当前作用域
    2. 再去相关类型的伴生对象中去找（A, B类的伴生对象中不能同时有）以及包对象中寻找
 */
