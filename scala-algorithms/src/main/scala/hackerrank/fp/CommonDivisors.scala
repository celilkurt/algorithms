package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object CommonDivisors {

  /**
   * Verilen bir sayı çifti için ortak çarpan sayısının bulunması
   * */

  def main(args: Array[String]): Unit = {

    val n = readInt
    val pairs = Range(0,n).map(i => readLine.split(" ").map(_.toInt))

    pairs.foreach(pair => {
      val tempGCD = gcd(pair(0),pair(1))
      val divisorCount = getDivisorCount(tempGCD)
      println(divisorCount)
    })

  }

  def getDivisorCount(n:Int):Int = Range(1,n+1).foldLeft(0){(sum,num) => {if(n%num == 0) sum + 1 else sum}}

  def gcd(x: Int, y: Int): Int = {
    if(y == 0) x else gcd(y,x%y)
  }


}
