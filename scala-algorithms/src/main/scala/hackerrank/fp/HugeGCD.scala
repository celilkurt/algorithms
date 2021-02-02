package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object HugeGCD {

  def main(args: Array[String]): Unit = {

    val n = readInt
    val firstFactors = readLine.split(" ").map(e => e.toInt)

    val m = readInt
    val secondFactors = readLine.split(" ").map(e => e.toInt)

    //val maxFactor = List(firstFactors.max , secondFactors.max).max
    val firstNum = firstFactors.foldLeft(BigInt(1))((product,factor) => product*factor)
    val secondNum = secondFactors.foldLeft(BigInt(1))((product,factor) => product*factor)

    println(gcd(firstNum,secondNum)%1000000007)

  }

  def gcd(x: BigInt, y: BigInt): BigInt = if(y == 0) x else gcd(y,x%y)


}
