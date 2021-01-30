package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}


object ListAndGCD {

  def main(args: Array[String]) {

    val n = readInt

    val numbs = Range(0,n).map(i => {
      val numbs = readLine.split(" ").map(_.toInt).grouped(2)
      numbs.map { case Array(k, v) => k -> v }.toMap
    })

    val commonFactors = Range(1,n).foldLeft(numbs(0).keySet)((set,i) => {
      set.intersect(numbs(i).keySet)
    })

    for(factor <- commonFactors.toList.sorted){
      val powerOf = numbs.foldLeft(Int.MaxValue)((power,num) => {
        val iPowerOf = num.getOrElse(factor,0)
        if(iPowerOf < power) iPowerOf else power
      })
      print(factor + " " + powerOf + " ")
    }



  }
}