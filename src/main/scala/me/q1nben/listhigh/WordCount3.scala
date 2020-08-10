package me.q1nben.listhigh

object WordCount3 {
    def main(args: Array[String]): Unit = {
        val t1 = List(
            ("hello Hello Scala Spark World", 4),
            ("Hello Spark Scala", 3),
            ("Hello Scala", 2),
            ("Hello", 1)
        )
        // 方法1
        val result = t1
                .map(kv => (kv._1 + " ") * kv._2)
                .flatMap(_.split(" "))
                .filter(_.length > 0)
                .groupBy(x => x)
                .mapValues(_.length)
        println(result)
        // 方法2
        val wordTuples = t1.flatMap(kv => {
            val line = kv._1
            val count = kv._2
            line.split(" ").map((_, count))
        })
        val tempCount = wordTuples.groupBy(_._1)
        val result2 = tempCount.mapValues(kv => {
            kv.foldLeft(0)(_ + _._2)
        })
        println(result2)
    }
}
