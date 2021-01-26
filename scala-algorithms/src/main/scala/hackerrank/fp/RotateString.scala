package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object RotateString {

  def main(args: Array[String]): Unit = {

    val n = readInt
    for(i <- 0 until n){

      val str = readLine
      for(j <- 1 until str.length){
        print( str.substring(j,str.length) + str.substring(0,j) + " ")
      }
      println()

    }
  }


}
