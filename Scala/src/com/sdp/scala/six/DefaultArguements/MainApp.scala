package com.sdp.scala.six.DefaultArguements

/**
 * Created by bmason06 on 11/02/2016.
 */

import com.atomicscala.AtomicTest._

object MainApp extends App {

  //6

  val t = new SimpleTime(h = 5, m = 30)
  t.hours is 5
  t.minutes is 30

  // 7

  val t2 = new SimpleTime2(h=10)
  t2.hours is 10
  t2.minutes is 0

  //8

  val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
  p.hasMoon is false

  //9

  val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
  earth.hasMoon is true

  //10

  val flour = new Item(name="flour", 4)
  flour.cost(grocery=true) is 4

  val sunscreen = new Item(name="sunscreen", 3)
  sunscreen.cost() is 3.3

  val tv = new Item(name="television", 500)
  tv.cost(taxRate = 0.06) is 530

}
