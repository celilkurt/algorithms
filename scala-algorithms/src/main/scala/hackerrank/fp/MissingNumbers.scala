package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object MissingNumbers {


  def main(args: Array[String]): Unit = {
    val n = readInt
    val aList: Array[Int] = (for (i <- readLine.split(" ")) yield i.toInt)
    val m = readInt
    val bList: Array[Int] = (for (i <- readLine.split(" ")) yield i.toInt)

    val aFre = aList.groupBy(identity).view.mapValues(_.size).toList
    val bFre = bList.groupBy(identity).view.mapValues(_.size).toList

    



  }
}
