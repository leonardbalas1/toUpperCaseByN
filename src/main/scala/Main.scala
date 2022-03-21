import scala.io.Source

object Main extends App {
  val filename = args(0)
  val n = args(1).toInt

  def toUpperCase(filename: String, n: Int): Unit = {
    val words = Source.fromFile(filename).getLines().flatMap(_.split("\\W+")).toList

    for{
      r <- 1 until words.size+1
    } yield {
      if(r%3 == 0) println(words(r-1).toUpperCase())
      else println(words(r-1))
    }
  }
  toUpperCase(filename, n)
}
