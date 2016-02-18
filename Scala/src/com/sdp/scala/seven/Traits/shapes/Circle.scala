package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
case class Circle(radius: Double) extends Shape {

  override def sides(): Int = 1

  override def perimeter(): Double = 2 * math.Pi * radius

  override def area(): Double = math.Pi * radius * radius

}
