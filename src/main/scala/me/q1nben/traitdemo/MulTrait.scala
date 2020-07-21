package me.q1nben.traitdemo

object MulTrait {
    def main(args: Array[String]): Unit = {
        /*val abc = new ABC
        abc.foo()*/
        // 动态混入
        val my:A = new MyClass with A with B with C
        my.foo()
    }
}

class MyClass

class ABC extends A with B with C {
    override def foo(): Unit = {
        super.foo()
        println("ABC...")
    }
}

trait A {
    def foo():Unit = println("A...")
}

trait B extends A {
    override def foo(): Unit = {
        super.foo()
        println("B...")
    }
}

trait C extends A {
    override def foo(): Unit = {
        super[A].foo()
        println("C...")
    }
}

/*
1. 如果一个类混入的特质中有相同的实现好的方法，则会产生成员冲突，无法编译成功
2. 可以使用菱形的继承结构解决冲突问题，冲突解决之后，方法为最后混入的那个
3. super[A] 可以通过方括号具体指代，否则会按顺序向上找
4. scala支持动态混入，可以在创建对象的时候with特质。也支持多重混入,调用的也是最后混入的那个
 */