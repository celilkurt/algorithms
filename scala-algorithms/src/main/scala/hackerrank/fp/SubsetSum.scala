package hackerrank.fp

import scala.io.StdIn.{readInt, readLine, readLong}

object SubsetSum {

  def main(args: Array[String]): Unit = {

    val n = readInt
    val numbs = readLine.split(" ").map(_.toLong).sorted(Ordering.Long.reverse)
    val queryCount = readInt
    val queries = for(i <- 1 to queryCount) yield readLong

    calQueries(numbs,queries,queryCount,n)


  }


  def calQueries(numbs: Array[Long], queries: IndexedSeq[Long], queryCount: Int, n: Int) = {

    val sortedQueries = queries.sorted
    var ansMap: Map[Long,Int] = Map()
    var curLength:Int = 1
    var sum: Long = 0L

    for(query <- sortedQueries){

      if(curLength == -1){
        ansMap += (query -> (-1))
      }else{

        while(sum < query && curLength <= n){
          sum += numbs(curLength-1)
          curLength += 1
        }

        if(sum >= query){
          ansMap += (query -> (curLength-1))
        }else{
          ansMap += (query -> (-1))
          curLength = -1
        }
      }
    }
    queries.foreach(query => println(ansMap.getOrElse(query,-1)))

  }

}
