package me.q1nben.pattern

object PatternDemo2 {
    def main(args: Array[String]): Unit = {
        val a:Any = "abc"
        val Ba = 100
        val aA = 200
        a match {
            case 20 => println(20)
            case Ba => println(Ba)
            case aa => println(aa)
            case `aA` => println(`aA`)
        }
    }
}
/*
    aa 是新声明的变量，只能在当前case中使用
    case Ba
    变量为大写字母开头, scala认为这个变量是常量，必须是已经定义好的常量
    若要使用小写字母开头的常量，需要使用``来包括常量名。
 */
