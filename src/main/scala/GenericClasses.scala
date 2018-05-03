/**
  * Created by keith.dauris on 11/05/2017.
  */
class GenericClasses[A] {

  def reorder(list: List[A]) = {
    println(list.reverse)
  }
}

object GenericClasses {
  def main(args: Array[String]): Unit = {
    val list = List.range(1, 11)
    val gc = new GenericClasses[Int]
    gc.reorder(list)

    val list1 = List("Scala", "Java", "C++", "Python", "Ruby", "PHP")
    val gc1 = new GenericClasses[String]
    gc1.reorder(list1)
  }
}


