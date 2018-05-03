/**
  * Created by keith.dauris on 09/05/2017.
  */
class Person (firstName: String, surname: String) {

  def addPersonDetails (message: String) = {
    println(message + " " + firstName + " " + surname)
  }
}

case class Trainer (firstName: String, surname: String) extends Person(firstName, surname) {
//  def addCoursesTrained(courses: List): Unit = {
//    //some code
//  }

}

case class Alumni (firstName: String, surname: String) extends Person(firstName, surname) {
//  def coursesToStudy(courses: List): Unit = {
//    //some code
//
//  }
}

case class Testing (message: String) {
  def printSomething() = {
    println(message)
  }
}







