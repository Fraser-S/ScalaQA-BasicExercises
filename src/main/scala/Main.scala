/**
  * Created by Fraser on 05/06/2017.
  */
object Main {

  //displays a string to the screen
  def displayStringToConsole(message: String) : Unit ={
    //display the message
    println(message)
  }

  def main(args: Array[String]) : Unit = {

    //defines a string
    val message : String = "Hello World"

    displayStringToConsole(message)
  }
}
