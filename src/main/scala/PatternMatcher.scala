/**
  * Created by keith.dauris on 10/05/2017.
  */
class PatternMatcher() {

  def matchStrings(name: String) {
    val output = name match {
      case s: String if s.charAt(0) == 'A' && s.length < 5 => s + " starts with an A"
      case s: String if s.length < 5 => s + " does not start with an A"
      case _ => name + " is too long a name"
    }
    println(output)
  }
}

object PatternMatcher {
  def apply() = new PatternMatcher()

  def main(args: Array[String]) {
    val matcher = PatternMatcher()
    matcher.matchStrings("Anthony")
    matcher.matchStrings("ant")
    matcher.matchStrings("Ant")
  }
}
