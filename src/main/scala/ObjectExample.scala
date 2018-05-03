/**
  * Created by keith.dauris on 10/05/2017.
  */
class ObjectExample (message: String) {
  def printGreeting(name: String) : Unit = {
    println(message + " "  + name)
  }

  def printGreeting() : Unit = {
    println(message)
  }
}

object ObjectExample{
  def apply(message: String) = new ObjectExample(message)
  def apply() = new ObjectExample("No message")

  def main(args: Array[String]): Unit = {
    ObjectExample("Hello").printGreeting("Keith")
    ObjectExample().printGreeting()
  }
}