package com.sdp.scala.six.Constructors

/**
 * Created by bmason06 on 11/02/2016.
 */

import com.atomicscala.AtomicTest._

object TeaScript extends App {

  val tea = new Tea(name = "Earl Grey")
  tea.describe is "Earl Grey"
  tea.calories is 0

  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0

  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16

  val teaLatte = new Tea(name = "Earl Grey", sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116

}
