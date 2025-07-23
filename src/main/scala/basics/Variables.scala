package basics

object Variables extends App {
  val immutableValue: Int = 10  
  var mutableValue: String = "Scala"

  println(s"Immutable: $immutableValue")
  println(s"Mutable before: $mutableValue")

  mutableValue = "Learning Scala"
  println(s"Mutable after: $mutableValue")
}
