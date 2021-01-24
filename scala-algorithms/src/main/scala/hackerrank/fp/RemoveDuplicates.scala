package hackerrank.fp

import scala.io.StdIn.readLine

object RemoveDuplicates {

  def main(args: Array[String]) {

    val str = readLine

    //her bir karaktere karşılık bir boolean oluştur, her bir karakter için şu kontrol yapılır
    //eğer yazdıysam false yazmadıysa true olur tru karakterler yazılır.
    var isValid: List[Boolean] = List.fill(28)(true) //is valid for writing

    str.foreach(c => {
      if(isValid(c.toInt-97)){
        print(c)
        isValid = isValid.updated(c.toInt-97,false)
      }
    })

  }
}