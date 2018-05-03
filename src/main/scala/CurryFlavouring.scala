/**
  * Created by keith.dauris on 10/05/2017.
  */
class CurryFlavouring {

}

object CurryFlavouring {
  def filter(myList: List[Int], p: Int => Boolean): List[Int] = {
    if (myList.isEmpty) myList
    else if (p(myList.head)) myList.head :: filter(myList.tail, p)
    else filter(myList.tail, p)
  }
  def modN(n: Int)(x: Int) = ((x % n) == 0)

  val nums = List.range(0,11)
  println(filter(nums, modN(2)))
  println(filter(nums, modN(3)))
}

object NotCurried {
  def filter(nums: List[Int], n: Int): List[Int] = {
      nums.filter((x: Int) => ((x % n) == 0))
  }
  val nums = List.range(0,11)
  println(filter(nums, 2))
  println(filter(nums, 3))
}

object MainCurry {
  def main(args: Array[String]): Unit = {
    NotCurried
  }
}
