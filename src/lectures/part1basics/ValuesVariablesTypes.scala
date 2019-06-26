package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  // Values
  val aString: String = "hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 412341233123452L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14


  // Variables
  var aVariable: Int = 4

  aVariable = 5 // side effect
}
