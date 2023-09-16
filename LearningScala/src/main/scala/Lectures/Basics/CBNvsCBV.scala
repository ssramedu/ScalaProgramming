package Lectures.Basics

object CBNvsCBV extends App {

  def callByValue(time: Long): Unit = {
    println("Value: " + time)
    println("Value: " + time)
  }

  def callByName(time: => Long): Unit = {
    println("Value: " + time)
    println("Value: " + time)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

}
