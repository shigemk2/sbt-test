import org.json4s.native.JsonMethods._
import org.json4s.DynamicJValue._

object Main {
  def main(args: Array[String]): Unit = {
    val abc = parse("""{ "a" : { "b" : { "c" : [1,2,3] } } }""")
    val de = parse("""{ "e" : "e" }""")
    println(abc \\ "a")
    println(abc \\ "b")
    println((abc \\ "c")(1))
    // println("test start")
  }
}
