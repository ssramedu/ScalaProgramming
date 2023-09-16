package Lectures.Basics

object Expressions extends App {

  val aNumber = 1 + 2
  println(aNumber)

  println(2 + 3 * 4)

  println( 1 == aNumber)

  println (!(1 == aNumber))

  var myWeight = 91
  println(myWeight)
  var afterWeightLossMyWeight = myWeight - 20;
  println(afterWeightLossMyWeight)

  //after heavy workout and diet, I have reduced even more weight
  afterWeightLossMyWeight -= 15

  println(afterWeightLossMyWeight)

  //If expression

  val aCondition = true

  val conditionValue= if(aCondition) 5 else 3

  println(conditionValue)

  //in scala we can use an if expression as a side effect

  println(if(aCondition) 5 else 3)

  //Everything in scala is an expression
  var aVariable = 0
  val aValue = (aVariable = 3) // In Scala -> Unit == Void

  //Side Effects in scala are println(), whiles, reassigning values to var's, expressions returning values (unit)

  //Code Blocks are expressions. The value of the code block is the value of the last expression on that code
  //block

  val aCodeBlock = {
    var a = 1
    var b = a + 2

    if(b > a ) "True" else "False"
  }

  //Expressions vs Instructions.

  //Instructions are executed (Java). Expresssions are evaluated(Scala)

}
