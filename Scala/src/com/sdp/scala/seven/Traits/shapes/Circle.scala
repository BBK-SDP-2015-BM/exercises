package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
class Circle(r: Double) extends Shape {

  override def sides(): Int = 1

  override def perimeter(): Double = 2 * math.Pi * r

  override def area(): Double = math.Pi * r * r

}
