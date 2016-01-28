package com.sdp.scala.one

import com.atomicscala.AtomicTest._
import com.sdp.scala.one.Cup3

/**
 * Created by bmason06 on 28/01/2016.
 *
 * All Scala exercises crammed into one, sorry its ugly (I know its not good to do this)
 */
object ScalaExercises extends App {

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

  println(f("sunny", 90.0))           // true
  println(f("sunny", 70.0))           // false
  println(g("partly cloudy", 90.0))   // true
  println(g("cloudy", 90.0))          // false
  println(h("sunny", 10.0))           // true
  println(h("sunny", 50.0))           // false

  println(fToC(100.0))
  println(cToF(fToC(100.0)))

  // Method Tests

  // 1.
  val a = getSquare(3)
  assert(a == 9)

  val b = getSquare(6)
  assert(b == 36)

  val c = getSquare(5)
  assert(c == 25)

  // 2.
  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  assert(t1 == false)

  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2 == true)

  // 3.
  val m1 = manyTimesString("abc", 3)
  assert(m1 == "abcabcabc", "no match")

  val m2 = manyTimesString("123", 2)
  assert(m2 == "123123", "no match")

  // Classes

  // 1.
  val r1 = new Range(1,200,3)
  printf("Range 1 step: %d\n", r1.step)

  val r2 = new Range(1,200,2)
  printf("Range 2 step: %d\n", r2.step)

  // 2.
  var s1 = "Sally"
  var s2 = "Sally"

  if (s1.equals(s2)) printf("%s and %s are equal\n", s1, s2) else printf("%s and %s are not equal\n", s1, s2)

  // Creating Classes

  // 1.
  val h1 = new Hippo
  println(h1)

  val l1 = new Lion
  println(l1)

  val tig1 = new Tiger
  println(tig1)

  val mon1 = new Monkey
  println(mon1)

  val g1 = new Giraffe
  println(g1)

  // 2.
  val l2 = new Lion
  println(l2)

  val g2 = new Giraffe
  println(g2)

  val g3 = new Giraffe
  println(g3)

  // Methods inside classes

  // 3.
  val sailboat = new Sailboat

  val sail1 = sailboat.raise()
  //assert(sail1 == "Sails raised", "Expected Sails raised, Got " + sail1)

  val sail2 = sailboat.lower()
  //assert(sail2 == "Sails lowered", "Expected Sails lowered, Got " + sail2)

  val motorboat = new Motorboat

  val motor1 = motorboat.start()
  assert(motor1 == "Motor on", "Expected Motor on, Got " + motor1)

  val motor2 = motorboat.stop()
  assert(motor2 == "Motor off", "Expected Motor off, Got " + motor2)

  // 2.
  val flare = new Flare
  val f1 = flare.light
  assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

  // 3.
  val sailboat2 = new Sailboat
  val signal = sailboat2.signal()
  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

  val motorboat2 = new Motorboat
  val flare2 = motorboat2.signal()
  assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

  // Fields in Classes

  // 1.
  val cup1 = new Cup1
  cup1.add(45) is 45
  cup1.add(-15) is 30
  cup1.add(-50) is -20

  // 2.
  val cup2 = new Cup2
  cup2.add(45) is 45
  cup2.add(-55) is 0
  cup2.add(10) is 10
  cup2.add(-9) is 1
  cup2.add(-2) is 0

  // 3.
  var cup3 = new Cup3
  cup3.percentFull = 56
  cup3.percentFull is 56

  // 4.
  val cup4 = new Cup2
  cup4.set(56)
  cup4.get() is 56

}

// classes

class Hippo {}
class Lion {}
class Tiger {}
class Monkey {}
class Giraffe {}
class Sailboat {
  def raise() = println("Sails raised")
  def lower() = println("Sails lowered")
  def signal(): String = {
    val f = new Flare
    f.light()
  }
}
class Motorboat {
  def start(): String = {"Motor on"}
  def stop(): String = {"Motor off"}
  def signal(): String = {
    val f = new Flare
    f.light()
  }
}
class Flare {
  def light(): String = {"Flare used!"}
}
class Cup1 {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }
}
class Cup2 {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    if(percentFull < 0) {
      percentFull = 0
    }
    percentFull // Return this value
  }
  def set(x: Int) = {
    percentFull = x
  }
  def get() = {
    percentFull
  }
}