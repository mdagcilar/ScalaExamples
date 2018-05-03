/**
  * Created by keith.dauris on 12/05/2017.
  */
class GettersSetters {

  private var _name = ""

  def name = _name
  def name_= (value:String):Unit = _name = value


}

object GettersSetters {
  def apply (): GettersSetters = new GettersSetters
}

object MainGS{
  def main(args: Array[String]): Unit = {
    var gs = GettersSetters.apply()
    gs.name_=("keith")
    gs.name = "Fred"
    println(gs.name)
  }
}

