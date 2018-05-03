/**
  * Created by keith.dauris on 10/05/2017.
  */
class Factorial(x: Double) {

  def factorial(): Double = {
    def fact(x: Double, accumulator: Double): Double = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }
    fact(x, 1)
  }
}

object Factorial {
  def apply(x: Double): Factorial = new Factorial(x)
}

object Main {
  def main(args: Array[String]): Unit = {
      val facts = Factorial(7)
      println(facts.factorial())
  }
}
