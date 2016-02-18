package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
object Draw {

  def apply(s: Shape): String = s match {
    case s:Circle => "A circle of radius " + s.radius + "cm"
    case s:Rectangle => "A rectangle of width " + s.width + "cm and height " + s.height + "cm"
    case s:Square => "A square of size " + s.length + "cm"
    case _ => throw new RuntimeException("Class not found")
  }

}
