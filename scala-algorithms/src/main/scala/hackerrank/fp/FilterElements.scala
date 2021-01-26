package hackerrank.fp

import scala.collection.MapView
import scala.io.StdIn.{readInt, readLine}

object FilterElements {

  def main(args: Array[String]): Unit = {

    val n = readInt

    for(i <- 1 to n){
      val params = readLine.split(" ")
      val k = params(1).toInt
      val list: Array[Int] = (for (i <- readLine.split(" ")) yield i.toInt)
      val freMap: MapView[Int,Int] = list.groupBy(identity).view.mapValues(_.size)
      var validNums = freMap.filter(_._2 >= k).keySet

      if(validNums.size == 0){
        println(-1)
      }else{
        for(num <- list){
          if(validNums.contains(num)){
            print(num + " ")
            validNums -= num
          } 
        }
        println()
      }


    }


  }

}
