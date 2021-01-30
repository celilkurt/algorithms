package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object CommonDivisors {

  

  def main(args: Array[String]): Unit = {

    val n = readInt
    for(_ <- 1 to n){

      val params = readLine.split(" ").map(_.toInt)
      val num = gcd(params(0),params(1))

      val count = Range(1,num).foldLeft(0){(sum,tempNum) => {if(num%tempNum == 0) sum + 1 else sum}}
      println(count+1)

    }
  }

  def gcd(x: Int, y: Int): Int = {
    if(y == 0) x else gcd(y,x%y)
  }


}
