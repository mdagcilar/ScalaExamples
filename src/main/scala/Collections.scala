

/**
  * Created by keith.dauris on 15/05/2017.
  */
class Collections {

  val set = Set(10, 20, 30, 40, 50 ,60)
  println(set)

  val map = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
  val map2 = map + (4 -> "Four")
  println("map" + map)
  println("map2" + map2)
  println(map(2))
  println(map2(2))


  val list: List[String] = List("one", "two", "three", "four", "five")
  val list2: List[String] = List("ten", "twenty", "thirty", "forty", "fifty")
  val heads = list(2)
  val tailEnd = list ::: list.tail ::: list.tail
  println(heads)
  println(list)
  println(tailEnd)
  println(map.keys)
  println(map.values)
}

object Collections {
  def main(args: Array[String]): Unit = {
    new Collections

  }
}


