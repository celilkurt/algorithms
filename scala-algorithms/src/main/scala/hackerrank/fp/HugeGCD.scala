package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object HugeGCD {

  /***
   * her bir çarpan 1000'den küçükmüş iki dizinin en büyük elemenanına göre asal sayılar hesaplanmalı,
   * böylece ortak çarpanların bulunması daha aza mal olur.
   *
   */

  def main(args: Array[String]): Unit = {

    val n = readInt
    val firstFactors = readLine.split(" ").map(e => e.toInt)

    val m = readInt
    val secondFactors = readLine.split(" ").map(e => e.toInt)

    val maxFactor = (firstFactors ++ secondFactors).max

  }



}
