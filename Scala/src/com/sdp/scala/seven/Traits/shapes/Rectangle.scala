package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
class Rectangle(length: Double, width: Double) extends Shape {

  override def sides(): Int = 4

  override def perimeter(): Double = 2 * length + 2 * width

  override def area(): Double = length * width

}
