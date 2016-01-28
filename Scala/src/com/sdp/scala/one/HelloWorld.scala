package com.sdp.scala.one

/**
 * Created by bmason06 on 28/01/2016.
 */
object HelloWorld extends App {

  // Expression tests

  println(f("sunny", 90.0))           // true
  println(f("sunny", 70.0))           // false
  println(g("partly cloudy", 90.0))   // true
  println(g("cloudy", 90.0))          // false
  println(h("sunny", 10.0))           // true
  println(h("sunny", 50.0))           // false

  println(fToC(100.0))
  println(cToF(fToC(100.0)))

  // Method Tests

  val a = getSquare(3)
  assert(a == 9)

  val b = getSquare(6)
  assert(b == 36)

  val c = getSquare(5)
  assert(c == 25)

  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  assert(t1 == false)

  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2 == true)

  val m1 = manyTimesString("abc", 3)
  assert(m1 == "abcabcabc", "no match")

  val m2 = manyTimesString("123", 2)
  assert(m2 == "123123", "no match")

  // Classes

  var r1 = new Range(1,200,3)
  printf("Range 1 step: %d\n", r1.step)

  var r2 = new Range(1,200,2)
  printf("Range 2 step: %d\n", r2.step)

  // Expressions (done in REPL and checked)

  // 1.
  def f(sky: String, temp: Double) = {
    if (sky == "sunny" && temp > 80.0) true else false
  }

  // 2.
  def g(sky: String, temp: Double) = {
    if ((sky == "sunny" || sky == "partly cloudy") && temp > 80.0) true else false
  }

  // 3.
  def h(sky: String, temp: Double) = {
    if ((sky == "sunny" || sky == "partly cloudy") && (temp > 80.0 || temp < 20.0)) true else false
  }

  // 4.
  def fToC(temp: Double): Double = {
    (temp - 32.0) * (5.0/9.0)
  }

  // 5.
  def cToF(temp: Double): Double = {
    (temp * (9.0/5.0)) + 32.0
  }

  // Methods

  // 1.
  def getSquare(x: Int): Int = {
    x*x
  }

  // 2.
  def isArg1GreaterThanArg2(arg1: Double, arg2: Double): Boolean = {
    if (arg1 > arg2) true else false
  }

  // 3.
  def manyTimesString(s: String, x: Int): String = {
    s*x
  }

}