package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object MissingNumbers {


  def main(args: Array[String]): Unit = {
    val n = readInt
    val aList: Array[Int] = (for (i <- readLine.split(" ")) yield i.toInt)
    val m = readInt
    val bList: Array[Int] = (for (i <- readLine.split(" ")) yield i.toInt)

    val aFre = aList.groupBy(identity).view.mapValues(_.size)
    val bFre = bList.groupBy(identity).view.mapValues(_.size)

    val missingNumbers = (for(b <- bFre.keySet if (aFre.getOrElse(b,0) != bFre.getOrElse(b,0))) yield b)

    missingNumbers.toList.sorted.foreach(num => print(num + " "))
  }
}
