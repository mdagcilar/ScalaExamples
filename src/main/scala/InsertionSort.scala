class InsertionSort {

}

object InsertionSort {
  def apply: InsertionSort = new InsertionSort()

  def main(args: Array[String]): Unit = {
    val listToSort = Array(6,3,1,8,5,7,4,9,2)
    BubbleSort().sortList( listToSort)
    listToSort.foreach(i => print(i + " "))
  }
}
