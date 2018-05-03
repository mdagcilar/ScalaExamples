/**
  * Created by keith.dauris on 18/05/2017.
  */
class Strings {

  def removeComma(): Unit = {
    var testSString = "22,716,345,678"
    var newString = testSString.replaceAll(",","")
    println(newString)
  }

}

object Strings {
  def main(args: Array[String]): Unit = {
    val newStrings = new Strings
    newStrings.removeComma()
  }
}
