package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object StringOPermute {

  def main(args: Array[String]) {

    val n = readInt

    for(i <- 1 to n){
      val str = readLine
      Range(0,str.length,2).foreach(i => print(str(i+1) + "" +str(i)))
      println()

    }

  }


}
