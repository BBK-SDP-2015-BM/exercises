package com.sdp.scala.six.ParameterisedTypes

/**
 * Created by bmason06 on 11/02/2016.
 */

import com.atomicscala.AtomicTest._

object MainApp extends App {

  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }

  // Explicit return type:
  def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = {
    Vector(c1, c2, c3)
  }

  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicit('a', 'b', 'c') is "Vector(a, b, c)"

}
