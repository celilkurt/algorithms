package hackerrank.fp

import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}


object PrefixCompression {
  def main(args: Array[String]) {

    var str1: String = readLine()
    var str2: String = readLine()
    var isReplaced = false

    if(str1.length < str2.length){
      val tempStr = str1
      str1 = str2
      str2 = tempStr
      isReplaced = true
    }


    var lastI = 0

    breakable{
      for(i <- 0 to str2.length-1){
        if(str1(i) != str2(i)){
          break
        }else{
          lastI = i
        }

      }
    }

    if(isReplaced)
      printStrings(str2,str1,lastI+1)
    else
      printStrings(str1,str2,lastI+1)

  }


  def printStrings(str1: String, str2: String, n: Int) {

    println(n + " " + str1.substring(0,n))
    println((str1.length - n) + " " + str1.substring(n))
    println((str2.length - n) + " " + str2.substring(n))

  }
}