class BubbleSort() {

  def sortList(myList: Array[Int]): Array[Int] = {
    var swapped = true
    while (swapped) {
      swapped = false
      for( i <- 0 to myList.length-2) {
        if (myList(i) > myList(i + 1)) {
          val tmp = myList(i)
          myList(i) = myList(i+1)
          myList(i+1) = tmp
          swapped = true
        }
      }
    }
    myList
  }
}

object BubbleSort {

  val test = "hello"

  if ( test == "hello") {
    println(test)
  } else {
    println("false")
  }

  BubbleSort().sortList(Array(3,7,4,9)).foreach(i => print(i + " " ))
  println(" ")



  def apply(): BubbleSort = new BubbleSort()

  def main(args: Array[String]): Unit = {
    val listToSort = Array(6,3,1,8,5,7,4,9,2)
    val start = System.nanoTime()
    BubbleSort().sortList(listToSort)
    val end = System.nanoTime()
    listToSort.foreach(i => print(i + " " ))
  }

}
