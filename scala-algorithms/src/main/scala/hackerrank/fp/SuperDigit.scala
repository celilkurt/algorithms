package hackerrank.fp

import scala.io.StdIn.readLine

object SuperDigit {

  def superDigit(str: String, k: Int): BigInt = {

    var sum: BigInt = 0
    var numFreq: List[Int] = List.fill(10)(0)

    str.foreach(c => {
      val cAsDigit = c.asDigit
      numFreq = numFreq.updated(cAsDigit,numFreq(cAsDigit)+1)
    }  )

    for(i <- 1 until 10) sum += numFreq(i)*i
    sum *= k
    if (sum > 10)
      superDigit(sum.toString,1)
    else
      sum

  }

  def main(args: Array[String]): Unit = {

    val inputs = readLine.split(" ")
    println(superDigit(inputs(0),inputs(1).toInt))


  }


}
