package Lectures.Basics

object ValuesVariablesTypes extends App {

  //VAL are Immutable. We can take this akin to const in other languages.
  val number: Int = 10
  println(number)

  //No need to give type definition for a val as compiler will infer it from the right hand side
  //value given. Though this is not a proper coding practice, this is allowed in Scala.
  //In case we give explicit type definition as above, make sure the right hand value we give
  //matches the type definition. We cannot declare a type as "Int" and give a value of string.
  val name = "Sriram"
  println(name)

  //Rest of the types like char, long, double, boolean, string and all are same like Java.

  //Variables are declared in Scala with the keyword "var". What we declare as var can be changed.
  //In functional programming, changing a value of a variable or printing a value are all called side effects.

  var myAge: Int = 50
  println(myAge)
  myAge =  51
  println(myAge)
}
