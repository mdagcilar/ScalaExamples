
class CurryOne {
}

object CurryOne {
  def multiply(m: Int)(n: Int): Int = m * n

  def main(args: Array[String]): Unit = {
    val once = multiply(2)(3)
    println(once)
    val twice = multiply(2) _
    println(twice)
    println(twice(12))
  }
}

