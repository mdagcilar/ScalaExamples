class ApplyMethod {

  def apply(first: String, second: String) : Unit = {
      println(first.toUpperCase() + " " +  second.toUpperCase())
  }

  def update(first: String, second: String) : Unit = {
    println(first.toLowerCase() + " " +  second.reverse)
  }

}

object ApplyMethod {
  def apply() = new ApplyMethod()

  def main(args: Array[String]): Unit = {
    val concat = ApplyMethod()
    concat.apply("hello", "Keith")
    concat("Goodbye", "Keith")
    concat("Hi") = "KD"
    concat("Hey") = "oh"
  }
}
