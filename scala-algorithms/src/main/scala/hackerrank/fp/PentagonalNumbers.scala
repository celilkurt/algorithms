package hackerrank.fp

import scala.io.StdIn.readInt

object PentagonalNumbers {

  def main(args: Array[String]): Unit = {

    val n = readInt
    val queries = for(i <- 0 until n) yield readInt

    queries.foreach(n => println(penNumber(n-1)))

  }

  def penNumber(n:Long): Long = n + 1 + 3*(n*(n+1)/2)


}
