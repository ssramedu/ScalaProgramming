package Lectures.Basics

import scala.annotation.tailrec

object Recursion extends App {

  def aFactorial(n: BigInt): BigInt = {
    if (n <= 1) 1
    else
      n * aFactorial((n-1))
  }

  println(aFactorial(10))
  println(aFactorial(4000))

@tailrec
def aConcatenateTailRec(aString:String, n:Int, accumulator:String):String  = {
  if(n <= 0) accumulator
  else
    aConcatenateTailRec(aString, n-1, aString + accumulator)
}
print(aConcatenateTailRec("Hello", 3, ""))
}
