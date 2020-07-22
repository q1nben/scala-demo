package me.q1nben.implicitdemo

object ImplicitDemo1 {
    def main(args: Array[String]): Unit = {
        // 加上implicit，称为隐式转换函数
        implicit def float2Int(f: Float) = {
            println("f...")
            f.toInt
        }
//        implicit def float2Int2(f: Float) = f.toInt
        implicit def double2Int(d: Double) = {
            println("d...")
            d.toInt
        }
        val a: Int = 10.1f
        val b: Int = 20.2f
        println(a)
        println(b)
    }
}
/*
隐式转换
    1. 隐式转换函数
    implicit def double2Int(d: Double) = d.toInt
    不看函数名，只看参数和返回值得类型
    存在两个满足条件的函数，就会报错

    2. 隐式类
    从2.10新增，开始有隐式类，对隐式转换函数的包装
        1. 不能为顶级类，必须是内部类
        2. 主构造必须有参数
        3. 隐式类优先级低于隐式转换函数，优先找隐式转化函数
        在spark中更多使用隐式转换函数
 */
