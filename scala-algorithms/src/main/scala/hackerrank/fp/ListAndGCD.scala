package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}
import scala.util.control.Breaks.{break, breakable}

object ListAndGCD {

  def main(args: Array[String]) {

    val n = readInt
    val list:List[List[Int]] = (for (i <- 0 until n) yield readLine.split(" ").foreach(_.toInt).asInstanceOf[Option[List[Int]]].get).toList

    var minI = 0
    for(i <- 1 until list.length) if(list(i).length < list(minI).length) minI = i


    var factorJoinList = Range(0,list(minI).length,2).foreach(list(minI)(_)).asInstanceOf[List[Int]]

    for(j <- 0 until list.length){
      if(j != minI){
        factorJoinList = Range(0,list(j).length,2).foreach(list(j)(_)).asInstanceOf[List[Int]].filter(factorJoinList.contains(_))

      }
    }
    var gcd: Int = 1
    for(factor <- factorJoinList){
      var minPower = -1
      for(i <- 0 until list.length){
        breakable{
          for(j <- 1 until list(i).length by 2){//ilgili sayının çarpanları arasında bu çarpanın üstünü bulmak için
            if(list(i)(j) == factor){
              if(list(i)(j+1) < minPower || minPower == -1){
                minPower = list(i)(j+1)
              }
              break
            }
          }
        }

      }
      gcd = gcd*math.pow(factor,minPower).toInt
    }
    println(gcd)
  }
}