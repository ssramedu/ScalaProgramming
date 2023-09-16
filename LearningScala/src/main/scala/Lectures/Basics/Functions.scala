package Lectures.Basics

object Functions extends App {

  def myFunction(a: String, b: Int) : String = {
    a + " " + b
  }

  println( myFunction("hello", 3) )

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())

  //In Scala2 this is possible, but Scala3 forbids us in doing so
  //println(aParameterLessFunction)

  //If you need to write loops, use Recursion.
  def aRepeatingFunction(aString: String, n: Int) : String = {
    if(n == 1) aString
    else aString + aRepeatingFunction(aString, n-1)
  }

  println(aRepeatingFunction("Hello", 3))

  //Function with side effects is a function that prints values to the console or return values
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("Sriram")

  //Everything is an expression in Scala. We can have a function declared within another function and call the
  //second function within the first function. Based on the return type of the second function
  //first functions return type will be determined, if not given already.

  def aFirstFunction(aNumber: Int) = {
    def aSecondFunction(a: Int, b: Int) : Int = a + b

    println(aSecondFunction(5, 5) + aNumber)
  }

  aFirstFunction(5)

  //Ex 1

  def aGreeting(name: String, age: Int) = {

    println("Hi, My name is " + name + " and I am " + age + " years old")
  }

  aGreeting("Sriram", 50)

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }
  println(factorial(5))

}
