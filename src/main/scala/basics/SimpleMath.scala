package basics

object SimpleMath extends App {
  def add(a: Int, b: Int): Int = a + b

  def multiply(a: Int, b: Int): Int = a * b

  println(s"3 + 4 = ${add(3, 4)}")
  println(s"5 * 6 = ${multiply(5, 6)}")
}
