class functionalBubblesort {

  def bubbleSort(list: List[Int]): List[Int] = {
    def sort(as: List[Int], bs: List[Int]): List[Int] =
      if (as.isEmpty) bs
      else bubble(as, Nil, bs)

    def bubble(startList: List[Int], tmpList: List[Int], workingList: List[Int]): List[Int] = startList match {
      case
        h1 :: h2 :: tail =>
        println("h1 = " + h1)
        println("h2 = " + h2)
        println("tail = " + tail)
        println("StartList = " + startList)
        println("tmpList = " + tmpList)
        println("workingList = " + workingList)
        println(" ")
        if (h1 > h2)
          bubble(h1 :: tail, h2 :: tmpList, workingList)
        else
          bubble(h2 :: tail, h1 :: tmpList, workingList)
      case
        h1 :: Nil => sort(tmpList, h1 :: workingList)
      case
        _ =>
        startList
    }

    sort(list, Nil)
  }
}

object functionalBubblesort {

  def apply(): functionalBubblesort = new functionalBubblesort()

  def main(args: Array[String]): Unit = {
//    val listToSort = List(6, 3, 1, 8, 5, 7, 4, 9, 2)
    val listToSort = List(6,3,1,8)
    if (!listToSort.isEmpty){
      val sorted: List[Int] = functionalBubblesort().bubbleSort(listToSort)
      sorted.foreach(i => (print(i + ":")))
    } else {
      print("List cannot be empty")
    }
  }
}
