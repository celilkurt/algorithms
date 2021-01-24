package hackerrank.fp

import scala.io.StdIn.readLine

object StringReductions {

  def main(args: Array[String]) {

    val str = readLine
    var charSet: List[Char] = List()
    str.foreach(c => if(!charSet.contains(c)) charSet = charSet.::(c))
    print(charSet.reverse.mkString)
  }
}