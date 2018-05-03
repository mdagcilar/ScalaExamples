/**
  * Created by keith.dauris on 10/05/2017.
  */
trait MyTrait {

  def addTwoInts(x: Int, y: Int): Int

  def squareAddedInts(x: Int, y: Int) : Int = {
    val result = addTwoInts(x, y)
    result * result
  }
}
