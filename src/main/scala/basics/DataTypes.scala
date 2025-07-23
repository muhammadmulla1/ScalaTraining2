package basics

object DataTypes extends App {
  val number: Int = 42
  val decimal: Double = 3.14
  val isScalaFun: Boolean = true
  val greeting: String = "Hello"

  println(s"Number: $number")
  println(s"Decimal: $decimal")
  println(s"Boolean: $isScalaFun")
  println(s"Greeting length: ${greeting.length}")
}
