package hackerrank.fp

import scala.io.StdIn.readLine

object GCP {

  def gcd(x: Int, y: Int): Int = {
    if(y == 0) x else gcd(y,x%y)

  }


  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }

  def main(args: Array[String]) {
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

  }
}
