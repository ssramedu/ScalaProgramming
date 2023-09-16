package Lectures.Basics

object DefaultArgs extends App {

  def savePicture(format:String = "jpg", width:Int = 1920, height:Int = 1080): Unit = println("Save Picture")

  savePicture("bmp")
  savePicture(width=2000)
}
