import java.lang.Math._

/**
  * Created by keith.dauris on 09/05/2017.
  */
object DeclarativeExample {

  def main(args: Array[String]): Unit = {
    val numbers = List.range(0,200)
    val message = new Person("Keith", "Dauris")
    message.addPersonDetails("Hello")
    println(numbers.filter(num => num%5 == 0))
    println(getSquareRootAsString(289))
  }



  def getSquareRootAsString(x: Int) : String = {
    val square = Math.sqrt(x)
    square.toString
  }

//  val x = 1 + 1
//  val y: Int = 2 + 2
//
//  var a = 1 + 1
//  var y: Int = 2 + 2
//
//  println({
//    val x = 1 + 1
//    x + 1
//  })
//
//  (x: Int) => x * x
//  val squared = (x: Int) => x * x
//
  val makeItSo = () => "Number One"


}
