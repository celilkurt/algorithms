package hackerrank.fp

import scala.io.StdIn.readInt



object Fibonacci {
  var fibMap: Map[Int,BigInt] = Map(0 -> 0, 1 -> 1)
  def main(args: Array[String]) {

    val n = readInt
    val queries:List[Int] = (for(i <- 0 until n) yield readInt()).toList
    for(query <- queries) println(Fibonacci(query) % (math.pow(10,8).toInt+7) )

  }

  def Fibonacci(n:Int): BigInt ={

    if(fibMap.contains(n)){
      fibMap(n)
    }else{
      val fibN = Fibonacci(n-1)+Fibonacci(n-2)
      fibMap += (n -> fibN)
      fibN
    }

  }


}