/**
  * Created by Fraser on 05/06/2017.
  */
object Main {

  def getOutputMessage() : String = {
    //return hello world
    "Hello World"
  }

  //displays a string to the screen
  def displayStringToConsole(message: String) : Unit ={
    //display the message
    println(message)
  }

  def main(args: Array[String]) : Unit = {

    //gets the message from getOutputMessage then display it using displayStringToConsole
    displayStringToConsole(getOutputMessage())
  }
}
