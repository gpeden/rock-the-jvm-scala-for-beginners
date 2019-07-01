package lectures.part1basics

import java.security.KeyStore
import java.security.KeyStore.TrustedCertificateEntry

object Functions extends App {

  def aFunction(a: String, b: Int) : String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION!!!


  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2. Factorial function 1 * 2 * 3 * .. * n
    3. Fibonacci function:
      f(1) = 1
      f(2) = 1
      f(n) = f(n -1) + f(n-2)
    4. Test if a number is prime
   */

  /*
    Greeting
   */
  def Greeting(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old."
  }
  println(Greeting("George", 52))

  /*
  Factorial
   */
  def Factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * Factorial(n - 1)
  }

  println("Factorial(1) = " + Factorial(1))
  println("Factorial(2) = " + Factorial(2))
  println("Factorial(3) = " + Factorial(3))
  println("Factorial(4) = " + Factorial(4))
  println()

  /*
    Fibonacci function:
      f(1) = 1
      f(2) = 1
      f(n) = f(n -1) + f(n-2)
   */
  def Fibonacci(n: Int): Int = {
    if(n <= 2) 1
    else Fibonacci(n - 1) + Fibonacci(n - 2)
  }

  println("Fibonacci(1) = " + Fibonacci(1))
  println("Fibonacci(2) = " + Fibonacci(2))
  println("Fibonacci(3) = " + Fibonacci(3))
  println("Fibonacci(4) = " + Fibonacci(4))
  println("Fibonacci(5) = " + Fibonacci(5))
  println("Fibonacci(6) = " + Fibonacci(6))
  println("Fibonacci(7) = " + Fibonacci(7))
  println()

  /*
    Prime Test

    Returns true if n is prime, else return false
    n = number to check
    i = divisor to check

   */
  def IsPrime(n: Int, i:Int = 2): Boolean = {
    // Corner case
    if (n <= 2) n == 2

    else if (n % i == 0) false

    else if (i * i  > n) true

    else IsPrime(n, i + 1)
  }

  println("IsPrime(1) = " + IsPrime(1))
  println("IsPrime(2) = " + IsPrime(2))
  println("IsPrime(3) = " + IsPrime(3))
  println("IsPrime(4) = " + IsPrime(4))
  println("IsPrime(5) = " + IsPrime(5))
  println("IsPrime(6) = " + IsPrime(6))
  println("IsPrime(7) = " + IsPrime(7))
  println("IsPrime(8) = " + IsPrime(8))
  println("IsPrime(9) = " + IsPrime(9))
  println("IsPrime(10) = " + IsPrime(10))
  println("IsPrime(101) = " + IsPrime(101))
  println()
}
