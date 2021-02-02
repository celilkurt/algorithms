package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object FunctionOrNot {

  def main(args: Array[String]) {

    val t = readInt
    for(i <- 0 until t){


      val pairCount = readInt

      if(isFunc(pairCount))
        println("YES")
      else
        println("NO")


    }

    def isFunc(pairCount: Int): Boolean = {
      var pairs:Map[Int,Int] = Map()
      for (j <- 0 until pairCount) {
        val pair = readLine().split(" ")
        val x = pair(0).toInt
        val y = pair(1).toInt

        if(isValid(x,y,pairs)){
          pairs += (x -> y)
        }else{
          return false
        }
      }
      true
    }


    def isValid(x:Int,y:Int,pairs:Map[Int,Int]): Boolean ={
      if(pairs.contains(x)){
        return pairs.get(x) == y
      }
      true
    }


  }
}