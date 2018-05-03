/**
  * Created by keith.dauris on 10/05/2017.
  */
class TraitTester extends MyTrait{
  override def addTwoInts(x: Int, y: Int): Int = x + y
}


object traitor {
  def main(args: Array[String]): Unit = {
    val traitTester = new TraitTester()
    println(traitTester.addTwoInts(4, 6))
    println(traitTester.squareAddedInts(3,9))
  }
}