package hackerrank.fp

import scala.io.StdIn.readLine

object StringMingling {

  def main(args: Array[String]): Unit = {

    val str1 = readLine
    val str2 = readLine

    Range(0,str1.length).foreach(i => print(str1(i) + "" + str2(i)))


  }

}
