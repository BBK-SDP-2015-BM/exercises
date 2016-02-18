package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
case class Rectangle(width: Double, height: Double) extends Rectangular {

  override def perimeter(): Double = 2 * width + 2 * height

  override def area(): Double = height * height

}
