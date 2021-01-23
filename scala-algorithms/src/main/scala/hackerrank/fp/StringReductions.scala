package hackerrank.fp

import scala.::
import scala.io.StdIn.readLine

object Solution {

  def main(args: Array[String]) {

    val str = readLine
    var charSet: List[Char] = List()
    str.foreach(c => if(!charSet.contains(c)) charSet = charSet.::(c))
    print(charSet.reverse.mkString)
  }
}