/**
  * Created by keith.dauris on 11/05/2017.
  */

import scala.xml._


class xmlTester(xml: Elem) {

 def parseXML: Unit = {
   val foo = xml
   println(foo.text.toString)
   println(foo \ "bar")
 }

}

object xmlTester {
  val xml = <foo><bar type="greet">hi</bar><bar type="count">1</bar><bar type="color">yellow</bar></foo>

  def main(args: Array[String]): Unit = {
    val myTest = new xmlTester(xml)
    myTest.parseXML
  }
}
