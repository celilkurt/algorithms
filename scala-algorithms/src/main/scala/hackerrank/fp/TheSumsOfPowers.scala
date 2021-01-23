package hackerrank.fp

import scala.io.StdIn.{readLine}

object TheSumsOfPowers {


  def numberOfWays(X:Int,N:Int):Int = {

    var root = math.pow(X.toDouble, 1 / N.toDouble).round.toInt
    if(root*root == X)
      root -= 1
    val list = (for(i <- 1 to root) yield math.pow(i,N).toInt).toList

    def ansTree(sum: Int, fromI:Int, list: List[Int]):Int = {

      if(sum < X)
        (for (i <- fromI until list.length) yield {
          val newSum = list(i) + sum
          if(newSum == X){
            1
          }else
            ansTree(newSum,i+1,list)
        }
          ).sum
      else 0

    }
    ansTree(0,0,list)
  }

  def main(args: Array[String]) {
    val nums = readLine().split(" ")
    println(numberOfWays(nums(0).toInt,nums(1).toInt))
  }
}
