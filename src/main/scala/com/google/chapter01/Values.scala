package com.google.chapter01

import java.util

/**
 * @created 2020/05/01
 * @project LearnScala
 * @author shiyuanchen
 */
object Values {
  def main(args: Array[String]): Unit = {
    val anInt: Int = 3;
    println("anInt: " + anInt)

    val aDouble: Double = 4.0
    println("aDouble: " + aDouble)

    val aCharacter: Character = 'c'
    println("aCharacter: " + aCharacter)

    val aString: String = "Google"
    println("aString: " + aString)

    val aSymbol: Symbol = Symbol("foo")
    println("aSymbol: " + aSymbol)

    val aPair = (aString, aDouble)
    println("aPair: " + aPair)

    val aList = List(1, 2, 3, 4)
    println("aList: " + aList)

    val aRange = 1 to 5
    println("aRange: " + aRange)

    val aMap = Map(3 -> "foo", 4 -> "bar")
    println("aMap: " + aMap)

    val aSet = Set(8, 9, 10)
    println("aSet: " + aSet)

    val anArray = Array(1, 2, 3, 4, 5)
    println("anArray: " + util.Arrays.toString(anArray))

    val unit = ()
    println("unit: " + unit)

    val nullValue = null
    println("nullValue: " + nullValue)

    def incImplicit(x: Int) = x + 1

    val incAnonymous = ((x: Int) => x + 1)

    println("incAnonymous: " + incAnonymous(3))
  }
}
