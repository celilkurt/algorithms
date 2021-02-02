package math

object PrimeNumbers {

  def getPrimeFactors(n: Int): List[Int] = {

    if(n < 2){
      return List.empty[Int]
    }else if(n%2 == 0){
      return  getPrimeFactors(n/2) :+ 2
    }else if(n%3 == 0){
      return getPrimeFactors(n/3) :+ 3
    }

    for(i <- 5 to n by 6 ){
      if(n%i == 0) {
        return getPrimeFactors(n/i) :+ i
      }else if(n%(i+2) == 0){
        return getPrimeFactors(n/(i+2)) :+ (i+2)
      }
    }
    List.empty[Int]

  }

  def isPrime(n: Long):Boolean = {

    if(n < 2){
      return false
    }else if(n <= 3){
      return  true
    }else if(n%2 == 0 || n%3 == 0){
      return false
    }

    val sqrt = scala.math.sqrt(n).floor.toInt
    for(i <- 5 to sqrt by 6 if(n%i == 0 || n%(i+2) == 0)){
      return false
    }

    true

  }



}
