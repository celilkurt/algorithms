package hackerrank.fp

import scala.util.control.Exception._


class Calculator{

  def power(n: Int,p: Int): Double = {
    if(n < 0 || p < 0)
      throw new ArithmeticException("n and p should be non-negative")
    else return Math.pow(n,p).toInt
  }

}



object Exception {

  def main(args: Array[String]) {
    var myCalculator=new Calculator();
    var T=scala.io.StdIn.readLine().toInt

    while(T>0){
      val Array(n,p) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
      try{
        var ans=myCalculator.power(n,p);
        println(ans);
      }
      catch{
        case e: Exception => {
          println(e.getMessage());
        }
      }
      T-=1;
    }
  }
}