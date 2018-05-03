
/**
  * Created by keith.dauris on 10/05/2017.
  */
abstract class MixinExample {
  val evens = (num: Int) => num%2 == 0
  val odds = (num: Int) => num%2 != 0

  def getEvenNums: List[Int]
}

trait MixinTrait extends MixinExample {
  def getOddNums: List[Int] = {
    val nums = List.range(0,100)
    nums.filter(odds)
  }
//  override def getEvenNums: List[Int] = {
//    val nums = List.range(0,100)
//    nums.filter(num => num%5 == 0)
//  }
}

class MixinClass() extends MixinExample {
  override def getEvenNums: List[Int] = {
    val nums = List.range(0,100)
    nums.filter(evens)
  }
}

object MixinTester {
  def main(args: Array[String]) {
    class Tester extends MixinClass with MixinTrait
    val tester = new Tester
    println(tester.getEvenNums)
    println(tester.getOddNums)
  }
}

