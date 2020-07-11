package me.q1nben.string

object MultiString {
    def main(args: Array[String]): Unit = {
        val s: String =
            """嘻嘻
              |你好
              |    你好
              |我是""".stripMargin
        println(s)
        val date: String = "2020-07-11"
        val sqlString: String =
            s"""select
              | *
              |from user
              |where date = '$date'
              |""".stripMargin
        println(sqlString)
    }

}
