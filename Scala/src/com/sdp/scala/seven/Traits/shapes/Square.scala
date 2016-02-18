package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
case class Square(length: Double) extends Rectangular {

  override def perimeter(): Double = 4 * length

  override def area(): Double = length * length

}
