import java.text.{DateFormat, SimpleDateFormat}

/**
  * Created by keith.dauris on 18/05/2017.
  */
class Dates {

   def changeDateFormat() = {
     var myDate = "Wed, 17 May 2017 12:00:01 GMT"
     val strDate = myDate.substring(5,16)
     strDate.replaceAll(" ", "")
     println("[" +  strDate.replaceAll(" ", "/") + "]")
     val df = new SimpleDateFormat("ddMMyyyy")
   }

}

object Dates {
  def main(args: Array[String]): Unit = {
    val dates : Dates = new Dates()
    dates.changeDateFormat()
  }
}
