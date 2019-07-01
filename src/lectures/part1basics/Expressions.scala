package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(1 != x)

  println(1 > x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions (DO) vs. Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  // WHILE loop - don't do this...
  var i = 0

  while (i < 10) {
    println(i)
    i += 1
  }

  // DON'T DO THIS ^^^

  val aWeirdValue = aVariable = 3
  println(aWeirdValue)

  // Side effects: println(), whiles, reassigning

  // Code blocks
  val aCodeBlock =
  {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

  // 1. Difference between "hello world" and println("hello world"). value of string, the other is an expression probably true or 1
  // 2.

  val someValue = {
    2 < 3
  }

  // Probably... boolean true
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  // Probably Integer value 42
  println(someOtherValue)
}
