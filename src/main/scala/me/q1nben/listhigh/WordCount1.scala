package me.q1nben.listhigh

import scala.io.Source

object WordCount1 {
    def main(args: Array[String]): Unit = {
        // 定义路径
        val path = """F:\code2020\scala\scala-demo\src\main\scala\me\q1nben\listhigh\WordCount1.scala"""
        // 获取文件内容
        val content = Source.fromFile(path, "utf-8").getLines.toList
        // 切割单词
        val words = content.flatMap(_.split("\\W+"))
        val wordGroup = words.groupBy(w => w)
        /* val wordCount = wordGroup.map(kv => {
            (kv._1 -> kv._2.size)
        })*/
        val wordCount = wordGroup.mapValues(_.size)
        println(wordCount)
    }
}
