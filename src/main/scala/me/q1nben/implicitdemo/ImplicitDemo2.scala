package me.q1nben.implicitdemo

import java.io.File

import scala.io.Source

object ImplicitDemo2 {
    def main(args: Array[String]): Unit = {
        implicit def file2RichFile(file: File):RichFile = new RichFile(file)
        val content:String = new File("F:\\code2020\\scala\\scala-demo\\src\\main\\scala\\me\\q1nben" +
                "\\implicitdemo\\ImplicitDemo2.scala").readContent
        println(content)
    }
}

class RichFile(file: File) {
    def readContent():String = {
        Source.fromFile(file, "utf-8").mkString
    }
}