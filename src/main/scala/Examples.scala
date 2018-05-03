import java.io.File

/**
  * Created by keith.dauris on 08/05/2017.
  */

trait fileManager {
  val file: File
}


class Examples(file: File) {
  def sideEffects() = {
    file.listFiles()

  }

}

