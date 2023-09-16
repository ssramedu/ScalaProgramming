package Lectures.Basics

object StringOps extends App {

  val myStr = "Hello, How are you? I am fine"

  println(myStr.charAt(2))
  println(myStr.substring(2,11))
  println(myStr.split(" ").toList)
  println(myStr.startsWith("Hello"))
  println(myStr.replace(" ", "-"))
  println(myStr.toLowerCase())
  println(myStr.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt

  println('a' +:aNumberString:+ 'z')
  println(myStr.reverse)
  println(myStr.take(2))

  val name = "Sriram"
  val age = 50

  val greeting = s"Hello my name is $name and I am $age years old. Next year I will be ${age + 1} years old"

  println(greeting)

  val speed = 1.2f

  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)


}
