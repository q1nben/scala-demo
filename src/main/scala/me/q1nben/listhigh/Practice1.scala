package me.q1nben.listhigh

object Practice1 {
    def main(args: Array[String]): Unit = {
        val l1 = List(30, "aa", 70, false, 10, 20)
        val l2 = l1.filter(_.isInstanceOf[Int])
                .map(_.asInstanceOf[Int])
                .map(_ ** 2)
        println(l2)
    }

    implicit class RichInt(a: Int) {
        def **(i: Int) = math.pow(a, i).toInt
    }
}
