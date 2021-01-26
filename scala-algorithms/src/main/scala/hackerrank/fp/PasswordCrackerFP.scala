package hackerrank.fp

import scala.io.StdIn.{readInt, readLine}

object PasswordCrackerFP {

  /**
   * because can do must we what
   * wedowhatwemustbecausewecan
   * */

  def main(args: Array[String]): Unit = {

    val n = readInt
    for(i <- 0 until n){
      val passCount = readInt()
      val tempPasswords = readLine.split(" ")
      val input = readLine
      val passwords = tempPasswords.filter(input.contains(_))
      val ans = checkPassword(passwords,input,List.empty[String])

      if(ans == null){
        println("WRONG PASSWORD")
      }else{
        println(ans)
      }

    }

  }

  def checkPassword(passwords: Array[String], passToCheck: String, output:List[String]):String = {

    if(passToCheck.isEmpty){
      return output.mkString(" ")
    }


    for(pass <- passwords){

        if(passToCheck.startsWith(pass)){
          val newPassToCheck = passToCheck.substring(pass.length)
          val tempOutput = output :+ pass
          val maybeAns = checkPassword(passwords.filter(newPassToCheck.contains(_)),newPassToCheck,tempOutput)
          if(maybeAns != null){
            return maybeAns
          }
        }

    }

    null

  }



}
