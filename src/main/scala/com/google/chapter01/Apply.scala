package com.google.chapter01

/**
 * @created 2020/05/01
 * @project LearnScala
 * @author shiyuanchen
 */
object Apply {
  def main(args: Array[String]): Unit = {
    val s: String = "Hello"
    println(s(4))
    println(s(3))
    println(s.apply(4))
    println(s.apply(3))

    val hello: String = "Bonjour"
    println(hello.sorted.apply(3))
  }
}
