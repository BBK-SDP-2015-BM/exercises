package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
class Square(length: Double) extends Shape {

  override def sides(): Int = 4

  override def perimeter(): Double = 4 * length

  override def area(): Double = length * length

}
