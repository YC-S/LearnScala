package com.google.chapter01

/**
 * @created 2020/05/01
 * @project LearnScala
 * @author shiyuanchen
 */
object Exercise {
  def main(args: Array[String]): Unit = {
    println(10 max 2)
    println(2 >> 1024)
    val x: BigInt = 2
    println(x << 1023)
    val str: String = "Hello"
    println(str.head)
    println(str.last)
  }
}
