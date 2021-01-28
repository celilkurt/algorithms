package hackerrank.fp

import scala.io.StdIn.readLine

object StringCompression {

  def main(args: Array[String]): Unit = {

    val str = readLine

    var curIndex = 0

    val ans = for (_ <- 1 until str.length if (curIndex < str.length)) yield {
      val fre = calFrequence(curIndex,str)
      curIndex += fre
      if(fre == 1){
        str(curIndex-fre)
      }else{
        str(curIndex-fre) + fre.toString
      }

    }

    println(ans.mkString)

  }

  def calFrequence(beginIndex: Int,str: String): Int =
  {

    var fre = 1
    val subStr = str.substring(beginIndex,str.length)
    if(subStr.length == 1)
      return 1
    for(i <- 0 until subStr.length-1) if(subStr(i) != subStr(i+1)) return fre else fre += 1

    fre
  }



}
