/**
  * Created by keith.dauris on 11/05/2017.
  */
trait AbstractTrait {
  type T
  val element: T
}

abstract class AbstractListClass extends AbstractTrait {
  type T = List[Int]
  override val element: List[Int]
  def length = element.length
}

class MyClass extends AbstractListClass {
  override val element = List.range(1, 199)
  override def length: Int = {
    element.length
  }
}

object MyClass {

  def main(args: Array[String]): Unit = {
    val myClass = new MyClass
    println(myClass.length)
  }
}

