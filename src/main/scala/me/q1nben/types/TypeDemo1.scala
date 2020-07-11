package me.q1nben.types

object TypeDemo1 {
    def main(args: Array[String]): Unit = {
        val a: Unit = ()
        println(a)
    }
}

/*

    数据类型：

    java：
        8大基本数据类型：
            byte    1
            short   2
            char    2
            int     4
            long    8
            float   4
            double  8
            boolean 1 (不同虚拟机实现不同，有的用一个字节，有的用1位)

        引用数据类型
            对象类型
            除了基本类型都是引用类型
            基本类型有对应的包装类

    scala：
        所有数据都是对象！！！函数也是对象
        Any
            AnyVal
                Double
                ...
                Unit(类型)
                    对应着Java中的void
                    只有一个()，相当于空集，可以打印，显示为()
                    一般用于方法或函数不需要返回值的时候定义函数返回值类型
                StringOps
                    看成是String的加强版，当使用String时，java api不存在的方法，可以从StringOps
                    中寻找（隐式转化）
            AnyRef
 */