package hackerrank.fp

import scala.io.StdIn.readInt

object TheSumsOfPowers {


  def numberOfWays(X:Int,N:Int):Int = {

    val root = math.pow(X.toDouble, 1 / N.toDouble).round.toInt
    var list = (for(i <- 1 to root) yield math.pow(i,N)).toList

    //while()

    0
  }

  def main(args: Array[String]) {
    println(numberOfWays(readInt(),readInt()))
  }
}
