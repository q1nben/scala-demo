package me.q1nben.implicitdemo

import java.time.LocalDate

object ImplictiDemo3 {
    def main(args: Array[String]): Unit = {
        implicit def int2RichDate(days: Int) = new RichDate(days)
        val ago = "ago"
        val later = "later"
        val r = 2 days ago
        println(r)
        val r2 = 4 days later
        println(r2)
    }
}

class RichDate(days: Int) {
    def days(when: String): String = {
        if ("ago" == when) {
            LocalDate.now().plusDays(-days).toString
        }
        else if ("later" == when) {
            LocalDate.now().plusDays(days).toString
        }
        else {
            throw new Exception
        }
    }
}
